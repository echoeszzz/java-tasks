package task19;

import java.util.Arrays;

import static task19.FindStudent.findByFullName;
import static task19.SortStudentsByAVG.sort;

public class SortingAndFindingTest {
    private static Student[] STUDENTS = new Student[]{
            new Student("1", new int[]{2, 3, 4, 5, 2, 3}),
            new Student("2", new int[]{5, 5, 5, 5, 5, 5}),
            new Student("3", new int[]{2, 5, 4, 5, 5, 3}),
            new Student("4", new int[]{2, 3, 3, 5, 1, 3}),
            new Student("5", new int[]{2, 3, 4, 2, 1, 3}),
            new Student("6", new int[]{2, 3, 4, 3, 2, 3}),
            new Student("7", new int[]{2, 3, 2, 2, 5, 1}),
            new Student("8", new int[]{2, 5, 4, 5, 5, 5}),
            new Student("9", new int[]{5, 5, 4, 5, 5, 5})};

    public static void main(String[] args) {
        SortingTest();
        FindingTest();
    }

    private static void FindingTest() {
        /// Finding when student in array:
        try {
            Student founded_student = findByFullName(STUDENTS, "1");
            System.out.println("We found student: " + founded_student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        /// Finding when student not in array:
        try {
            Student founded_student = findByFullName(STUDENTS, "666");
            System.out.println("We found student: " + founded_student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

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
}
