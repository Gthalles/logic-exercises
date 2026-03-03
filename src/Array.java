import java.math.RoundingMode;
import java.util.*;

public class Array {
    Integer getSum(Integer[] arr) {
        var sum = 0;

        for (Integer number : arr) {
            sum += number;
        }

        return sum;
    }

    double findBiggest(Integer[] arr) {
        var biggest = Double.MIN_VALUE;

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

    Set<Integer> removeDuplicates(Integer[] arr) {
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
}