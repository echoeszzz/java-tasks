package task9;


import java.util.Arrays;

public record Student(String name, String surname, int id, int[] marks) implements Comparable<Student> {

    public double averageMark() {
        return marks.length != 0 ? (double) Arrays.stream(marks).sum() / marks.length : 0;
    }

    @Override
    public int compareTo(Student othStudent) {
        return Double.compare(othStudent.averageMark(), this.averageMark());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", id=").append(id);
        sb.append(", marks=");
        if (marks == null) {
            sb.append("null");
        } else {
            sb.append('[');
            for (int i = 0; i < marks.length; ++i) {
                sb.append(i == 0 ? "" : ", ").append(marks[i]);
            }
            sb.append(']');
        }
        sb.append(" AVG: ").append(averageMark());
        sb.append('}');
        return sb.toString();
    }
}
