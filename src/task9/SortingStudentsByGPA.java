package task9;


import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA {

    Comparator<Student> cmp = Comparator.comparingDouble(Student::averageMark);

    public void quickSort(ArrayList<Student> array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = getPartition(array, begin, end);
            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex, end);
        }
    }

    private int getPartition(ArrayList<Student> array, int begin, int end) {
        var pivot = array.get(end);
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (cmp.compare(array.get(j), pivot) <= 0) {
                i++;
                var swapTemp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, swapTemp);
            }
        }
        var swapTemp = array.get(i + 1);
        array.set(i + 1, array.get(end));
        array.set(end, swapTemp);
        return i + 1;
    }

    public void sortStudentsByGPA(ArrayList<Student> students) {
        quickSort(students, 0, students.size());
    }
}
