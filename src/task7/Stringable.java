package task7;

import java.util.Scanner;

public interface Stringable {
    int countChars(String string);

    String getOddChars(String string);

    String inverseString(String string);
}

class ProcessStrings implements Stringable {

    @Override
    public int countChars(String string) {
        return string.length();
    }

    @Override
    public String getOddChars(String string) {
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < string.length(); i += 2) {
            oddChars.append(string.charAt(i));
        }
        return oddChars.toString();
    }

    @Override
    public String inverseString(String string) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; --i) {
            reverseString.append(string.charAt(i));
        }
        return reverseString.toString();
    }
}

class TestProcessString {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Введите строку >> ");
        var string = sc.nextLine();
        var ps = new ProcessStrings();
        System.out.println("Длина строки = " + ps.countChars(string));
        System.out.println("Четные символы строки = " + ps.getOddChars(string));
        System.out.println("Инвертированная строка = " + ps.inverseString(string));
    }
}