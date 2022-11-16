package task20;

public class Calculator {
    public static <T extends Number, V extends Number> void add(T first, V second) {
        System.out.println(first.doubleValue() + second.doubleValue());
    }
    public static <T extends Number, V extends Number> void subtract(T first, V second) {
        System.out.println(first.doubleValue() - second.doubleValue());
    }
    public static <T extends Number, V extends Number> void multiple(T first, V second) {
        System.out.println(first.doubleValue() * second.doubleValue());
    }
    public static <T extends Number, V extends Number> void divide(T first, V second) {
        System.out.println(first.doubleValue() / second.doubleValue());
    }
}
