package task9;

import static task9.SortingStudentsByGPA.sort;

public class SortTest {
    private static Student[] STUDENTS = new Student[]{new Student("1", "1", 1, new int[]{2, 3, 4, 5, 2, 3}),
            new Student("2", "2", 2, new int[]{5, 5, 5, 5, 5, 5}),
            new Student("3", "3", 3, new int[]{2, 5, 4, 5, 5, 3}),
            new Student("4", "4", 4, new int[]{2, 3, 3, 5, 1, 3}),
            new Student("5", "5", 5, new int[]{2, 3, 4, 2, 1, 3}),
            new Student("6", "6", 6, new int[]{2, 3, 4, 3, 2, 3}),
            new Student("7", "7", 7, new int[]{2, 3, 2, 2, 5, 1}),
            new Student("8", "8", 8, new int[]{2, 5, 4, 5, 5, 5}),
            new Student("9", "9", 9, new int[]{5, 5, 4, 5, 5, 5})};

    private static void SortingTest() {
        System.out.println("Initial state of the list:");
        for (Student student : STUDENTS) {
            System.out.println(student);
        }
        sort(STUDENTS);
        System.out.println("State of the list after sorting:");
        for (Student student : STUDENTS) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingTest();
    }
};

