import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Integer[] arr = {55, 44, 33, 22, 11, 0};
        ArrayUtils arrUtils = new ArrayUtils(arr);

        String str = "Thalles Garbelotti";
        StringUtils strUtils = new StringUtils(str);

        System.out.println("Arrays Section");
        System.out.println("Input: " + Arrays.toString(arr) + "\n");

        var sumResult = arrUtils.getSum();
        printer.write("Sum array elements", sumResult);

        var biggestNumber = arrUtils.findBiggest();
        printer.write("Biggest number in array", biggestNumber);

        var evensCount = arrUtils.countEven();
        printer.write("Occurrences of evens numbers", evensCount);

        var reversedArray = arrUtils.reverseArr();
        printer.write("Reversed array", reversedArray);

        var arrHashSet = arrUtils.removeDuplicates();
        printer.write("HashSet of unique elements", arrHashSet);

        var secondBiggestNumber = arrUtils.findSecondBiggestNumber();
        printer.write("Second biggest number in array", secondBiggestNumber);

        var positiveOnlyNumbersSum = arrUtils.sumOnlyPositiveNumber();
        printer.write("Sum only positive numbers", positiveOnlyNumbersSum);

        var leftRotatedArr = arrUtils.rotateArray(-2);
        printer.write("Rotated array 2 positions to left", leftRotatedArr);

        var rightRotatedArr = arrUtils.rotateArray(2);
        printer.write("Rotated array 2 positions to right", rightRotatedArr);

        var maxSubArraySum = arrUtils.findMaxSubArraySum();
        printer.write("Biggest sum of a subarray into array", maxSubArraySum);

        System.out.println("\nStrings Section");
        System.out.println("Input: " + str + "\n");

        var reversedStr = strUtils.reverseString();
        printer.write("Reversed string", reversedStr);

        var palindrome = strUtils.isPalindrome();
        printer.write("Is palindrome?", palindrome);

        var vowelsCount = strUtils.countVowels();
        printer.write("Vowels number", vowelsCount);

        var charFrequency = strUtils.getCharFrequency();
        printer.write("Char frequency", charFrequency);

        var strWithoutDuplicates = strUtils.removeDuplicates();
        printer.write("String without duplicates", strWithoutDuplicates);

        var isAnagram = strUtils.isAnagram(reversedStr);
        printer.write(str + " and " + reversedStr + " is anagram?", isAnagram);

        var stringWithoutSpaces = strUtils.encodeString();
        printer.write("Replace spaces with %20", stringWithoutSpaces);

        var biggestSubstring = strUtils.findBiggestSubstringWithoutRepeatedCharacter();
        printer.write("Substring without repeated chars", biggestSubstring);

        // Grid
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        var gridUtils = new Grid();

        System.out.println("\nGRID - 1\n");
        gridUtils.printGrid(grid);

        System.out.println("\nGRID - 2\n");
        gridUtils.printNeighbors(grid, 1, 1);

        System.out.println("\nGRID - 3\n");
        int[][] grid2 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        gridUtils.simplePropagate(grid2);

        System.out.println("\nGRID - 4\n");
        gridUtils.propagate(grid2);
    }
}
