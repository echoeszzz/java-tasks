package task4;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "empty";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.format("%s двигается\n", fullName);
    }

    public void talk() {
        System.out.format("%s говорит\n", fullName);
    }
}

class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivan", 999);
        person1.move();
        person2.talk();
    }
}