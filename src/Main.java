//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Array arrUtil = new Array();
    int[] intArr = {1, 2, 3, 4, -4};
    double[] arr = {1, 2, 3, 4.44, -4.43};

    double sum = arrUtil.getSum(arr);
    IO.println("Sum: " + sum);

    double biggest = arrUtil.findBiggest(arr);
    IO.println("Biggest: " + biggest);

    int evens = arrUtil.countEven(intArr);
    IO.println("Events: " + evens);
}
