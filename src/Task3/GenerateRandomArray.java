package Task3;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomArray {
    static final private Random random = new Random();

    static int TakeRandomNumberByRandom() {
        return -1000 + (int) (Math.random() * 1000);
    }

    static int TakeRandomNumberByMath() {
        return random.nextInt(-1000, 1000);
    }

    static int[] TakeRandomArray(int length) {
        var array = new int[length];
        for (var i = 0; i < length; i++) {
            array[i] = (i % 2 == 0) ? TakeRandomNumberByRandom() : TakeRandomNumberByMath();
        }
        return array;
    }

    public static void main(String[] args) {
        var randomArray = TakeRandomArray(10);
        for (var elem : randomArray) {
            System.out.format("%s ", elem);
        }
        var sortedArray = Arrays.stream(randomArray).sorted();
        System.out.println();
        for (var elem : sortedArray.toArray()) {
            System.out.format("%s ", elem);
        }
    }
}
