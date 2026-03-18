//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

void main() {
    Printer printer = new Printer();

    Integer[] arr = {55, 44, 33, 22, 11, 0};
    ArrayUtils arrUtils = new ArrayUtils(arr);

    String str = "thalles garbelotti";
    StringUtils strUtils = new StringUtils();

    IO.println("Arrays Section");
    IO.println("Input: " + Arrays.toString(arr) + "\n");

    var sumResult = arrUtils.getSum(arr);
    printer.write("Sum array elements", sumResult);

    var biggestNumber = arrUtils.findBiggest(arr);
    printer.write("Biggest number in array", biggestNumber);

    var evensCount = arrUtils.countEven(arr);
    printer.write("Occurrences of evens numbers", evensCount);

    var reversedArray = arrUtils.reverseArr(arr);
    printer.write("Reversed array", reversedArray);

    var arrHashSet = arrUtils.removeDuplicates(arr);
    printer.write("HashSet of unique elements", arrHashSet);

    var secondBiggestNumber = arrUtils.findSecondBiggestNumber(arr);
    printer.write("Second biggest number in array", secondBiggestNumber);

    var positiveOnlyNumbersSum = arrUtils.sumOnlyPositiveNumber(arr);
    printer.write("Sum only positive numbers", positiveOnlyNumbersSum);

    var leftRotatedArr = arrUtils.rotateArray(arr, -2);
    printer.write("Rotated array 2 positions to left", leftRotatedArr);

    var rightRotatedArr = arrUtils.rotateArray(arr, 2);
    printer.write("Rotated array 2 positions to right", rightRotatedArr);

    var maxSubArraySum = arrUtils.findMaxSubArraySum(arr);
    printer.write("Biggest sum of a subarray into array", maxSubArraySum);

    IO.println("\nStrings Section");
    IO.println("Input: " + str + "\n");

    var reversedStr = strUtils.reverseString(str);
    printer.write("Reversed string", reversedStr);

    var palindrome = strUtils.isPalindrome(str);
    printer.write("Is palindrome?", palindrome);

    var vowelsCount = strUtils.countVowels(str);
    printer.write("Vowels number", vowelsCount);

    var charFrequency = strUtils.getCharFrequency(str);
    printer.write("Char frequency", charFrequency);

    var strWithoutDuplicates = strUtils.removeDuplicates(str);
    printer.write("String without duplicates", strWithoutDuplicates);

    var isAnagram = strUtils.isAnagram(str);
    printer.write("Is anagram?", isAnagram);

    var stringWithoutSpaces = strUtils.encodeString(str);
    printer.write("Replace spaces with %20", stringWithoutSpaces);

    var biggestSubstring = strUtils.findBiggestSubstringWithoutRepeatedCharacter(str);
    printer.write("Substring without repeated chars", biggestSubstring);
}
