import java.math.RoundingMode;
import java.util.Arrays;

public class Array {
    double getSum(double[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    double findBiggest(double[] arr) {
        double biggest = Double.MIN_VALUE;

        for (double number : arr) {
            if (number <= biggest) continue;

            biggest = number;
        }

        return biggest;
    }

    int countEven(int[] arr) {
        int count = 0;

        for (int n : arr) {
            if (n % 2 != 0) continue;

            count++;
        }

        return count;
    }

    int[] reverseArr(int[] arr) {
        int index = 0;
        int[] reversedArray = arr.clone();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index] = arr[i];
            index++;
        }

        return reversedArray;
    }
}

/*
1. Soma de elementos do array.
2. Encontrar o maior número (sem Math.max).
3. Contar quantos números pares existem.
4. Inverter um array sem usar .reverse().
5. Remover duplicados de um array.
6. Encontrar o segundo maior número.
7. Somar apenas números positivos de um array.
8. Rotacionar um array k posições (ex: [1,2,3,4,5], k=2 → [4,5,1,2,3]).
*/
