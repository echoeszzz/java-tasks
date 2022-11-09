package task8;

import java.util.Scanner;

public class IsPrime {

    private static boolean isPrimeHelp(int n, int i) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return isPrimeHelp(n, i + 1);
        } else {
            return true;
        }
    }

    public static boolean isPrime(int n) {
        return isPrimeHelp(n, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число >> ");
        System.out.println(isPrime(sc.nextInt()) ? "YES" : "NO");
    }
}
