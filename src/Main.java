//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Array arrUtil = new Array();
    Integer[] arr = {55, 44, 33, 22, 11, 0};

    var sumResult = arrUtil.getSum(arr);
    IO.println("Sum array elements: " + sumResult);

    var biggestNumber = arrUtil.findBiggest(arr);
    IO.println("Biggest number in array: " + biggestNumber);

    var evensCount = arrUtil.countEven(arr);
    IO.println("Occurrence of evens numbers: " + evensCount);

    var reversedArray = arrUtil.reverseArr(arr);
    IO.println("Reversed array: " + Arrays.toString(reversedArray));

    var arrHashSet = arrUtil.removeDuplicates(arr);
    IO.println("Array of unique elements: " + arrHashSet);

    var secondBiggestNumber = arrUtil.findSecondBiggestNumber(arr);
    IO.println("Second biggest number in array: " + secondBiggestNumber);

    var positiveOnlyNumbersSum = arrUtil.sumOnlyPositiveNumber(arr);
    IO.println("Only positive numbers sum: " + positiveOnlyNumbersSum);

    var leftRotatedArr = arrUtil.rotateArray(arr, -2);
    IO.println("Rotated array two positions to left: " + Arrays.toString(leftRotatedArr));

    var rightRotatedArr = arrUtil.rotateArray(arr, 2);
    IO.println("Rotated array two positions to right: " + Arrays.toString(rightRotatedArr));
}

