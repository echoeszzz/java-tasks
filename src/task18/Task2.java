package task18;

import java.util.Scanner;

public class Task2 {
    public void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally!!!");
        }
    }

    public static void main(String[] args) {
        Task2 foo = new Task2();
        //foo.exceptionDemo1();
        foo.exceptionDemo2();
    }
}
