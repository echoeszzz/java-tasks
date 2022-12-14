package task23;


public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        fillTest(queue);
        dumpTest(queue);
        fillTest(queue);
        clearTest(queue);
        fillTest(queue);
        getArrayTest(queue);
    }

    public static void fillTest(ArrayQueue queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void dumpTest(ArrayQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println(
                    queue.size() + " " + queue.element() + " " + queue.dequeue());
        }
    }

    public static void getArrayTest(ArrayQueue queue) {
        Object[] arr = queue.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void clearTest(ArrayQueue queue) {
        queue.clear();
        System.out.println("Queue is empty? " + queue.isEmpty());
    }
}
