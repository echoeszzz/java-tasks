package task10;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private String group;
    private int[] marks;

    public Student(String name, String surname, String specialization, int course, String group, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double averageMark() {
        return marks.length != 0 ? (double) Arrays.stream(marks).sum() / marks.length : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name_='").append(name).append('\'');
        sb.append(", surname_='").append(surname).append('\'');
        sb.append(", specialization_='").append(specialization).append('\'');
        sb.append(", course_=").append(course);
        sb.append(", group_='").append(group).append('\'');
        sb.append(", marks_=").append(Arrays.toString(marks));
        sb.append(", AVG mark=").append(averageMark());
        sb.append('}');
        return sb.toString();
    }
}
