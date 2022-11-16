package task19;

public class SortStudentsByAVG {
    public static void sort(Student[] students) {
        quicksort(students, 0, students.length - 1);
    }

    private static void quicksort(Student[] students, int low, int high) {
        if (students.length == 0 || low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Student pivot = students[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (students[i].compareTo(pivot) < 0) {
                i++;
            }
            while (students[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quicksort(students, low, j);
        }
        if (high > i) {
            quicksort(students, i, high);
        }
    }
}
