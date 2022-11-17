package task21;

import java.lang.reflect.Array;
import java.util.List;

public class MyArray<ValueType> {
    private ValueType[] array;

    public MyArray(ValueType[] array) {
        this.array = array;
    }

    public ValueType get(int index) {
        return array[index];
    }

    public void saveToList(List<ValueType> list) {
        list.addAll(List.of(array));
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
