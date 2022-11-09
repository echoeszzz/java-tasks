package task8;

import java.util.Scanner;

public class SumDigitsOfNumber {

    public static int sumOfDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число >> ");
        int number = sc.nextInt();
        System.out.println("Сумма цифр числа равна " + sumOfDigits(number));
    }
}
