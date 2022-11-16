package task19;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private final String fullName;
    private final int[] marks;

    public Student(String fullName, int[] marks) {
        this.fullName = fullName;
        this.marks = marks;
    }

    public String getFullName() {
        return fullName;
    }

    public int[] getMarks() {
        return marks;
    }

    private double getAVG() {
        return marks.length != 0 ? (double) Arrays.stream(marks).sum() / marks.length : 0;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return Double.compare(this.getAVG(), o.getAVG());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("fullName='").append(fullName).append('\'');
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
        sb.append(" AVG mark: ").append(getAVG());
        sb.append('}');
        return sb.toString();
    }
}
