package task6;

import java.util.ArrayList;

public interface Nameable {
    String getName();
}

class Human implements Nameable {
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "This human name is " + name;
    }

}

class Animal implements Nameable {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "This animal name is " + name;
    }
}

class TestNameable {
    public static void main(String[] args) {
        var nameableCreatures = new ArrayList<Nameable>();
        nameableCreatures.add(new Human("Human1"));
        nameableCreatures.add(new Animal("Animal2"));
        nameableCreatures.add(new Human("Human2"));
        nameableCreatures.add(new Animal("Animal2"));

        for (var nameableCreature : nameableCreatures) {
            System.out.println(nameableCreature.getName());
        }
    }
}
