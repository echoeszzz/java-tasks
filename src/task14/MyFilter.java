package task14;

import java.util.Arrays;

interface Filter {
    boolean apply(Object o);
}


public class MyFilter {
    public static Object[] myFilter(Object[] array, Filter filter) {
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                offset++;
            } else {
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"1rewf ", "feefewf", "a", null, "1"};

        String[] withoutNull = (String[]) myFilter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });
        String[] withoutA = (String[]) myFilter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != "a";
            }
        });
        System.out.println(Arrays.toString(withoutNull));
        System.out.println(Arrays.toString(withoutA));
    }
}
