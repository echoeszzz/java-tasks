package Task4;

public class Student {
    private String name;
    private String educationalEstablishment;

    public Student(String name, String educationalEstablishment) {
        this.name = name;
        this.educationalEstablishment = educationalEstablishment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducationalEstablishment() {
        return educationalEstablishment;
    }

    public void setEducationalEstablishment(String educationalEstablishment) {
        this.educationalEstablishment = educationalEstablishment;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", educationalEstablishment='" + educationalEstablishment + '\'' + '}';
    }
}

class SchoolStudent extends Student {

    public SchoolStudent(String name, String educationalEstablishment) {
        super(name, educationalEstablishment);
    }
}

class UniversityStudent extends Student {
    public UniversityStudent(String name, String educationalEstablishment) {
        super(name, educationalEstablishment);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("ivan1", "school 1010");
        students[1] = new UniversityStudent("ivan2", "mirea1");
        students[2] = new UniversityStudent("ivan3", "mirea2");
        students[3] = new UniversityStudent("ivan4", "mirea3");
        students[4] = new SchoolStudent("ivan5", "school mirea");

        for (var student : students) {
            System.out.println(student);
        }

    }
}
