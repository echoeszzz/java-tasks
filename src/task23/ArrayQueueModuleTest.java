package task23;


public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        fillTest();
        dumpTest();
        fillTest();
        clearTest();
        fillTest();
        getArrayTest();
    }

    public static void fillTest() {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
    }

    public static void getArrayTest() {
        Object[] arr = ArrayQueueModule.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void dumpTest() {
        while (!(ArrayQueueModule.isEmpty())) {
            System.out.println(
                    ArrayQueueModule.size() + " " + ArrayQueueModule.element() + " "
                            + ArrayQueueModule.dequeue());
        }
    }

    public static void clearTest() {
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());
    }
}