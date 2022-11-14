package task11;


import java.util.Arrays;
import java.util.Date;

public class Student {
    private String name_;
    private String surname_;
    private String specialization_;
    private int course_;
    private String group_;
    private int[] marks_;
    private Date birthDate;

    public Student(String name_, String surname_, String specialization_, int course_, String group_, int[] marks_, Date birthDate) {
        this.name_ = name_;
        this.surname_ = surname_;
        this.specialization_ = specialization_;
        this.course_ = course_;
        this.group_ = group_;
        this.marks_ = marks_;
        this.birthDate = birthDate;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getSurname_() {
        return surname_;
    }

    public void setSurname_(String surname_) {
        this.surname_ = surname_;
    }

    public String getSpecialization_() {
        return specialization_;
    }

    public void setSpecialization_(String specialization_) {
        this.specialization_ = specialization_;
    }

    public int getCourse_() {
        return course_;
    }

    public void setCourse_(int course_) {
        this.course_ = course_;
    }

    public String getGroup_() {
        return group_;
    }

    public void setGroup_(String group_) {
        this.group_ = group_;
    }

    public double averageMark() {
        if (marks_.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int value : marks_) {
            sum += value;
        }
        return sum / marks_.length;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name_='").append(name_).append('\'');
        sb.append(", surname_='").append(surname_).append('\'');
        sb.append(", specialization_='").append(specialization_).append('\'');
        sb.append(", course_=").append(course_);
        sb.append(", group_='").append(group_).append('\'');
        sb.append(", marks_=").append(Arrays.toString(marks_));
        sb.append(", AVG mark=").append(averageMark());
        sb.append(", birth date=").append(birthDate.toString());
        sb.append('}');
        return sb.toString();
    }
}

class test {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ruzin", "Programmer", 1, "IKBO-06-21", new int[]{1, 2, 3, 4, 1, 2}, new Date());
        System.out.println(student);
    }
}