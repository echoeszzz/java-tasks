package Task3;

public class FourRandomNums {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                System.out.println("\nSequence not increase");
                return;
            }
        }
        System.out.println("\nSequence increasing");
    }
}
