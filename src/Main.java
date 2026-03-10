//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
void main() {
    ArrayUtils arrUtils = new ArrayUtils();
    StringUtils strUtils = new StringUtils();

    String str = "Thalles Garbelotti";
    Integer[] arr = {55, 44, 33, 22, 11, 0};

    var sumResult = arrUtils.getSum(arr);
    IO.println("Sum array elements (input: " + Arrays.toString(arr) + ") result: " + sumResult);

    var biggestNumber = arrUtils.findBiggest(arr);
    IO.println("Biggest number in array (input: " + Arrays.toString(arr) + ") result: " + biggestNumber);

    var evensCount = arrUtils.countEven(arr);
    IO.println("Occurrence of evens numbers (input: " + Arrays.toString(arr) + ") result: " + evensCount);

    var reversedArray = arrUtils.reverseArr(arr);
    IO.println("Reversed array (input: " + Arrays.toString(arr) + ") result: " + Arrays.toString(reversedArray));

    var arrHashSet = arrUtils.removeDuplicates(arr);
    IO.println("Array of unique elements (input: " + Arrays.toString(arr) + ") result: " + arrHashSet);

    var secondBiggestNumber = arrUtils.findSecondBiggestNumber(arr);
    IO.println("Second biggest number in array (input: " + Arrays.toString(arr) + ") result: " + secondBiggestNumber);

    var positiveOnlyNumbersSum = arrUtils.sumOnlyPositiveNumber(arr);
    IO.println("Only positive numbers sum (input: " + Arrays.toString(arr) + ") result: " + positiveOnlyNumbersSum);

    var leftRotatedArr = arrUtils.rotateArray(arr, -2);
    IO.println("Rotated array 2 positions to left (input: " + Arrays.toString(arr) + ") result: " + Arrays.toString(leftRotatedArr));

    var rightRotatedArr = arrUtils.rotateArray(arr, 2);
    IO.println("Rotated array 2 positions to right (input: " + Arrays.toString(arr) + ") result: " + Arrays.toString(rightRotatedArr));

    // Strings
    var reversedStr = strUtils.reverseString(str);
    IO.println("Reversed string (input: \"" + str + "\") result: " + reversedStr);

    var palindrome = strUtils.isPalindrome(str);
    IO.println("Is palindrome? (input: \"" + str + "\") result: " + palindrome);

    var vowelsCount = strUtils.countVowels(str);
    IO.println("Vowels number (input: \"" + str + "\") result: " + vowelsCount);

    var charFrequency = strUtils.getCharFrequency(str);
    IO.println("Char frequency (input: \"" + str + "\") result: " + charFrequency);

    var strWithoutDuplicates = strUtils.removeDuplicates(str);
    IO.println("String without duplicates (input: \"" + str + "\") result: " + strWithoutDuplicates);

    var isAnagram = strUtils.isAnagram(str);
    IO.println("Is anagram? (input: \"" + str + "\") result: " + isAnagram);

    var stringWithoutSpaces = strUtils.encodeString(str);
    IO.println("Replace spaces with %20 (input: \"" + str + "\") result: " + stringWithoutSpaces);

    var biggestSubstring = strUtils.findBiggestSubstringWithoutRepeatedCharacter(str);
    IO.println("Substring without repeated chars (input: \"" + str + "\") result: " + biggestSubstring);

}
