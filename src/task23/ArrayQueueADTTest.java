package task23;

public class ArrayQueueADTTest {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        fillTest(queue);
        dumpTest(queue);
        fillTest(queue);
        clearTest(queue);
        fillTest(queue);
        getArrayTest(queue);
    }
    public static void fillTest(ArrayQueueADT queue) {
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
    }

    public static void getArrayTest(ArrayQueueADT queue) {
        Object[] arr = ArrayQueueADT.toArray(queue);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void dumpTest(ArrayQueueADT queue) {
        while (!ArrayQueueADT.isEmpty(queue)) {
            System.out.println(ArrayQueueADT.size(queue) + " " + ArrayQueueADT.element(queue) + " " + ArrayQueueADT.dequeue(queue));
        }
    }

    public static void clearTest(ArrayQueueADT queue) {
        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.isEmpty(queue));
    }
}