package task1;

import java.util.Scanner;

public class SumAndMean {

    public static int[] prepareArray() {
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length >> ");
        length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.format("arr[%s] >> ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double meanOfArray(int[] array) {
        var sum = sumOfArray(array);
        return (double) sum / (double) array.length;
    }

    public static void main(String[] args) {
        var array = prepareArray();
        var sum = sumOfArray(array);
        var mean = meanOfArray(array);
        System.out.format("Sum of array elements is: %s%n", sum);
        System.out.format("Mean of array is: %s", mean);
    }
}
