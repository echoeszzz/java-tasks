package task8;

import java.util.Scanner;

public class Factorization {
    private static void factorizationHelper(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            factorizationHelper(n / k, k);
        } else {
            factorizationHelper(n, ++k);
        }
    }

    public static void factorization(int n) {
        factorizationHelper(n, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число >> ");
        factorization(sc.nextInt());
    }
}
