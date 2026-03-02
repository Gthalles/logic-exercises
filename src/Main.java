//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Array arrUtil = new Array();
    int[] intArr = {55, 44, 33, 22, 11};
    double[] arr = {1, 2, 3, 4.44, -4.43};

    double sum = arrUtil.getSum(arr);
    IO.println("Sum array elements: " + sum);

    double biggest = arrUtil.findBiggest(arr);
    IO.println("Biggest number in array: " + biggest);

    int evens = arrUtil.countEven(intArr);
    IO.println("Count evens: " + evens);

    int[] reversedArray = arrUtil.reverseArr(intArr);
    IO.println("Reversed Array: " + Arrays.toString(reversedArray));
}
