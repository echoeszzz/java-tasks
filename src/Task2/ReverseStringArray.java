package Task2;

import java.util.Arrays;

public class ReverseStringArray {
    public static void reverse(String[] array) {
        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6"};
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
}
