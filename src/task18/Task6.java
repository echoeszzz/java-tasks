package task18;

import java.awt.*;

public class Task6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        Task6 foo = new Task6();
        try {
            foo.printMessage(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
