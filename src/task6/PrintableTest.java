package task6;

import java.util.ArrayList;

public class PrintableTest {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("Война и мир.", "Л. Н. Толстой", "*текст войны и мира*"));
        printables.add(new Shop("Дикси", new String[]{"Молоко", "Хлеб", "Колбаса", "Гречка"}));
        for (Printable printable : printables) {
            printable.print();
            System.out.println("====================");
        }
    }
}
