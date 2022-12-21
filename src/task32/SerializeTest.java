package task32;

import task29.Dish;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dish some_dish = new Dish(100, "Plate", "Some plate");
        System.out.println("Before test: " + some_dish);
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(some_dish);
        oos.flush();
        oos.close();
        /*sakcnlsaklcasnclkascnaklsncas*/
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        var foo = (Dish) oin.readObject();
        System.out.println("After test: " + foo);
    }
}
