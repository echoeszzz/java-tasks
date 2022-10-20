package task2;

import java.util.Vector;

public class Dog {
    private String name;
    private Double age;

    public Dog(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    Double getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return String.format("Собаку зовут %s, ей %s лет, по человечески это %s лет", name, age, getHumanAge());
    }
}

class TestDog {
    private final Vector<Dog> dogs;

    public TestDog() {
        dogs = new Vector<>();
    }

    public void add(Dog dog) {
        dogs.add(dog);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (var dog : dogs) {
            result.append(dog.toString()).append(".\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        TestDog dogs = new TestDog();
        dogs.add(new Dog("Бобик", 15.));
        dogs.add(new Dog("Жучка", 12.));
        dogs.add(new Dog("Белка", 1.));
        dogs.add(new Dog("Стрелка", 5.));
        System.out.print(dogs);
    }
}