package task9;


import java.util.Map;

public record Student(String name_,
                      String surname_,
                      int id_,
                      Map<String, Integer> marks_)
        implements Comparable<Student> {

    public void addNewMark(String discipline, Integer mark) {
        marks_.put(discipline, mark);
    }

    public double averageMark() {
        if (marks_.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        int count = 0;
        for (int value : marks_.values()) {
            count++;
            sum += value;
        }
        return sum / count;
    }

    @Override
    public int compareTo(Student othStudent) {
        return (averageMark() != othStudent.averageMark())
                ? Double.compare(averageMark(), othStudent.averageMark())
                : Double.compare(hashCode(), othStudent.hashCode());
    }
}
