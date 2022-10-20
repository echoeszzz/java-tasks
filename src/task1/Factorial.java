package task1;

public class Factorial {
    public static long GetFactorial(int number) {
        var result = 1;
        while (number != 0) {
            result *= number--;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.format("Факториал числа %s равен %s\n", i, GetFactorial(i));
        }
    }
}