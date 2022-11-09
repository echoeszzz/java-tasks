package task8;

import java.util.Scanner;

public class Palindrome {
    public static String isPalindrome(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку >> ");
        System.out.println(isPalindrome(sc.nextLine())); // вызов рекурсивной функции
    }
}
