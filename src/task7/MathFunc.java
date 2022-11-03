package task7;

import java.util.Scanner;

interface MathCalculable {
    double PI = Math.PI;

    double pow(double number);

    double abs(double number);
}

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double number) {
        return number * number;
    }

    @Override
    public double abs(double number) {
        return number > 0 ? number : -number;
    }
}

class TestMath {
    public static void main(String[] args) {
        var mf = new MathFunc();
        var sc = new Scanner(System.in);
        System.out.print("Введите радиус окружности >> ");
        var r = sc.nextDouble();
        System.out.println("Площадь равна: " + (mf.PI * mf.pow(r)));
    }
}