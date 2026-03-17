import java.util.*;

public class ArrayUtils {
    Integer getSum(Integer[] arr) {
        var sum = 0;

        for (Integer number : arr) {
            sum += number;
        }

        return sum;
    }

    Integer findBiggest(Integer[] arr) {
        var biggest = Integer.MIN_VALUE;

        for (Integer number : arr) {
            if (number <= biggest) continue;

            biggest = number;
        }

        return biggest;
    }

    Integer countEven(Integer[] arr) {
        var count = 0;

        for (Integer n : arr) {
            if (n % 2 != 0) continue;

            count++;
        }

        return count;
    }

    Integer[] reverseArr(Integer[] arr) {
        var index = 0;
        var reversedArray = arr.clone();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index] = arr[i];
            index++;
        }

        return reversedArray;
    }

    LinkedHashSet<Integer> removeDuplicates(Integer[] arr) {
        var arrList = List.of(arr);

        return new LinkedHashSet<Integer>(arrList);
    }

    Integer findSecondBiggestNumber(Integer[] arr) {
        var biggest = Integer.MIN_VALUE;
        var secondBiggest = Integer.MIN_VALUE;

        for (Integer number : arr) {
            if (number > biggest) {
                biggest = number;
            } else if (number > secondBiggest) {
                secondBiggest = number;
            }
        }

        return secondBiggest;
    }

    Integer sumOnlyPositiveNumber(Integer[] arr) {
        var sum = 0;

        for (Integer number : arr) {
            if (number <= 0) continue;
            sum += number;
        }

        return sum;
    }

    Integer[] rotateArray(Integer[] arr, Integer positions) {
        var rotatedArray = arr.clone();

            for (int index = 0; index < arr.length; index++) {
                var newPosition = (index + positions + arr.length) % arr.length;
                rotatedArray[newPosition] = arr[index];
            }

        return rotatedArray;
    }

    Integer findMaxSubArraySum(Integer[] arr) {
        var maxSum = arr[0];
        var currentSum = arr[0];

        for (var i = 1; i < arr.length; i++) {
            var nextSum = currentSum + arr[i];

            if (nextSum > currentSum) {
                currentSum = nextSum;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}