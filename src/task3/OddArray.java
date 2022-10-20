package task3;

import java.util.Arrays;
import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива >> ");

        int n = 0;

        while (n <= 5) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 5) {
                    System.out.print("Введенное число должно быть больше 5. Повторите ввод >> ");
                }
            } else {
                System.out.print("Вы ввели не число. Повторите ввод >> ");
                sc.next();
            }
        }
        int[] array = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 1));
            if (array[i] % 2 == 0) {
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(array));
        int[] oddArray = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                oddArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(oddArray));
    }
}
