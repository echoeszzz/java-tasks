package task1;

import static task1.SumAndMean.prepareArray;

public class SumAndMinMax {

    private static int sumDoWhile(int[] arr) {
        var sum = 0;
        if (arr.length != 0) {
            var i = 0;
            do {
                sum += arr[i++];
            } while (i != arr.length);
        }
        return sum;
    }

    private static int sumWhile(int[] arr) {
        var sum = 0;
        var i = 0;
        while (i != arr.length) {
            sum += arr[i++];
        }
        System.out.println(sum);
        return sum;
    }

    public static int[] findMinMax(int[] arr) {
        var minMax = new int[2];
        minMax[0] = arr[0];
        minMax[1] = arr[0];
        for (int j : arr) {
            if (minMax[0] > j) {
                minMax[0] = j;
            }
            if (minMax[1] < j) {
                minMax[1] = j;
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        var array = prepareArray();
        int sumDoWhile = sumDoWhile(array);
        int sumWhile = sumWhile(array);
        int[] minMax = findMinMax(array);
        if (sumWhile == sumDoWhile) {
            System.out.format("Sum of array elements is: %s%n", sumWhile);
        }
        System.out.format("min element of array is: %s%n", minMax[0]);
        System.out.format("max element of array is: %s%n", minMax[1]);
    }
}
