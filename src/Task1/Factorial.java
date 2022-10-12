package Task1;

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
        /*System.out.format("Факториал числа 10 равен %s\n", GetFactorial(10));
        System.out.format("Факториал числа 8 равен %s\n", GetFactorial(8));
        System.out.format("Факториал числа 5 равен %s\n", GetFactorial(5));
        System.out.format("Факториал числа 9 равен %s\n", GetFactorial(9));*/
    }
}