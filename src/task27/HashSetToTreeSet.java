package task27;

import java.util.*;

public class HashSetToTreeSet {


    public static void main(String args[]) {
        // создаем HashSet
        HashSet<String> set = new HashSet<>();
        // добавляем элементы в HashSet используя add()
        set.add("Java");
        set.add("I");
        set.add("Love");
        set.add("You");
        System.out.println("Original HashSet: " + set);
        // сортировка HashSet с использованием List
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        // печатаем отсортированные элементы HashSet
        System.out.println(
                "HashSet elements " + "in sorted order " + "using List: " + list);
        Set<String> tree_set = new TreeSet<>(set);
        System.out.println("TreeSet elements" + " in sorted order: ");
        System.out.print("[");
        for (String element : tree_set) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}