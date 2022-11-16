package task18;

public class Task1 {
    public void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public void exceptionDemo2() {
        System.out.println(2. / 0.);
    }

    public void exceptionDemo3() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        var foo = new Task1();
        //foo.exceptionDemo1();
        //foo.exceptionDemo2();
        foo.exceptionDemo3();
    }
}
