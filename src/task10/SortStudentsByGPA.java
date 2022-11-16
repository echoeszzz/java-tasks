package task10;

import java.util.Comparator;

public class SortStudentsByGPA {
    public static void sort(Student[] students) {
        Comparator<Student> cmp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.averageMark(), o1.averageMark());
            }
        };
        quicksort(students, 0, students.length - 1, cmp);
    }

    private static void quicksort(Student[] students, int low, int high, Comparator<Student> cmp) {
        if (students.length == 0 || low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Student pivot = students[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (cmp.compare(students[i], pivot) < 0) {
                i++;
            }
            while (cmp.compare(students[j], pivot) > 0) {
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
            quicksort(students, low, j, cmp);
        }
        if (high > i) {
            quicksort(students, i, high, cmp);
        }
    }
}
