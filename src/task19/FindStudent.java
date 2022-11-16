package task19;

import java.util.Arrays;
import java.util.Objects;

public class FindStudent {
    public static Student findByFullName(Student[] students, String fullName) throws StudentNotFoundException {
        var res =
                Arrays.stream(students).filter(student -> Objects.equals(student.getFullName(), fullName)).findFirst();
        if (res.isPresent()) {
            return res.get();
        } else {
            throw new StudentNotFoundException("Student named " + fullName + " not found");
        }
    }
}
