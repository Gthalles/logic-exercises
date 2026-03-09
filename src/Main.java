//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayUtils arrUtils = new ArrayUtils();
    Integer[] arr = {55, 44, 33, 22, 11, 0};

    var sumResult = arrUtils.getSum(arr);
    IO.println("Sum array elements: " + sumResult);

    var biggestNumber = arrUtils.findBiggest(arr);
    IO.println("Biggest number in array: " + biggestNumber);

    var evensCount = arrUtils.countEven(arr);
    IO.println("Occurrence of evens numbers: " + evensCount);

    var reversedArray = arrUtils.reverseArr(arr);
    IO.println("Reversed array: " + Arrays.toString(reversedArray));

    var arrHashSet = arrUtils.removeDuplicates(arr);
    IO.println("Array of unique elements: " + arrHashSet);

    var secondBiggestNumber = arrUtils.findSecondBiggestNumber(arr);
    IO.println("Second biggest number in array: " + secondBiggestNumber);

    var positiveOnlyNumbersSum = arrUtils.sumOnlyPositiveNumber(arr);
    IO.println("Only positive numbers sum: " + positiveOnlyNumbersSum);

    var leftRotatedArr = arrUtils.rotateArray(arr, -2);
    IO.println("Rotated array two positions to left: " + Arrays.toString(leftRotatedArr));

    var rightRotatedArr = arrUtils.rotateArray(arr, 2);
    IO.println("Rotated array two positions to right: " + Arrays.toString(rightRotatedArr));

    // Strings
    String str = "Thalles";
    StringUtils strUtils = new StringUtils();

    var reversedStr = strUtils.reverseString(str);
    IO.println("Reversed string: " + reversedStr);

    var palindrome = strUtils.isPalindrome(str);
    IO.println("Is palindrome: " + palindrome);

    var vowelsCount = strUtils.countVowels(str);
    IO.println("Vowels number is: " + vowelsCount);

    var charFrequency = strUtils.getCharFrequency(str);
    IO.println("Char frequency: " + charFrequency);

    var strWithoutDuplicates = strUtils.removeDuplicates(str);
    IO.println("String without duplicates: " + strWithoutDuplicates);

    var isAnagram = strUtils.isAnagram("bsanasb");
    IO.println("Is anagram: " + isAnagram);
}

