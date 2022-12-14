package task26;


import java.util.HashSet;
import java.util.Iterator;

class t4 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        // Добавляем элементы в HashSet с помощью метода add()
        h.add("Russia");
        h.add("Australia");
        h.add("South Africa");
        h.add("Russia");// пытаемся добавить еще один такой же элемент

        // Выводим элементы HashSet в консоль
        System.out.println(h);
        System.out.println("List contains Russia or not:" + h.contains("Russia"));

        // Удаляем элементы из множества с помощью метода remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}