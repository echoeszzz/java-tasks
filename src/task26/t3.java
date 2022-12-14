package task26;

import java.util.Hashtable;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(5, (float) 0.5);
        table.put(235, "firstAdd");
        table.put(52, "secondAdd");
        table.put(12897, "thirdAdd");

        System.out.println("Введите значение ключа, элемент которого следует вернуть");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        String flag = (String) table.get(key);
        if (flag != null) {
            System.out.println(key + " " + flag);
        } else {
            System.out.println("Введенный вами ключ отсутствует в таблице");
        }

        System.out.println("Введите значение ключа, элемент которого следует удалить");
        key = scanner.nextInt();
        flag = (String) table.get(key);
        if (flag != null) {
            table.remove(key);
            System.out.println(table);
        } else {
            System.out.println("Введенный вами ключ отсутствует в таблице");
        }

    }
}