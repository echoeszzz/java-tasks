package task21;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MyArray<ValueType> {
    private List<ValueType> list;

    public MyArray(ValueType[] arr) {
        list.addAll(Arrays.asList(arr));
    }

    public ValueType get(int index) {
        return list.get(index);
    }

    public void printFirstFive() {
        for (int i = 0; i < list.size() && i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
