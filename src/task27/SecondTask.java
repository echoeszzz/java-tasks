package task27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SecondTask {
    Map<String, String> names;

    public SecondTask() {
        this.names = new HashMap<String, String>();
        names.put("Рузин", "Иван");
        names.put("Иванов", "Иван");
        names.put("Тарасов", "Константин");
        names.put("Константинов", "Арсений");
        names.put("Сергеев", "Арсений");
        names.put("Иванов", "Сергей");
        names.put("Иванов", "Глеб");
        names.put("Глебов", "Матвей");
        names.put("Матвеев", "Максим");
        names.put("Максимов", "Даниил");
    }

    HashMap<String, String> createMap() {
        return new HashMap<String, String>(names);
    }

    int getSameFirstNameCounter(String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : names.entrySet()) {
            String value = pair.getValue();
            if (name.equals(value)) {
                count++;
            }
        }
        return count;
    }

    int getSameLastNameCounter(String lastname) {
        int count = 0;
        for (Map.Entry<String, String> pair : names.entrySet()) {
            String key = pair.getKey();
            if (lastname.equals(key)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SecondTask st = new SecondTask();
        Map<String, String> map = st.createMap();
        System.out.println(st.getSameFirstNameCounter("Иван"));
        System.out.println(st.getSameLastNameCounter("Иванов"));
    }
}
