package task21;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrintDirectory {
    public static List<Object> list = new LinkedList<>();

    public static void main(String[] args) {
        File file = new File("/Users/ivanruzin/mirea/java/java-tasks");
        Collections.addAll(list, file.listFiles());
        for (int i = 0; i < 5; ++i) {
            System.out.println(list.get(i));
        }
    }
}