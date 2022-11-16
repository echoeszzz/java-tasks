package task20;

public class MinMax<T extends Comparable<T>> {

    private final T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        if (array.length == 0) {
            return null;
        }
        T minVar = array[0];
        for (T element : array) {
            if (element.compareTo(minVar) < 0) {
                minVar = element;
            }
        }
        return minVar;
    }

    public T max(T[] arr) {
        if (array.length == 0) {
            return null;
        }
        T maxVar = array[0];
        for (T element : array) {
            if (element.compareTo(maxVar) > 0) {
                maxVar = element;
            }
        }
        return maxVar;
    }
}
