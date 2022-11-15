package task13;

public class Person {
    String name;
    String surname;
    String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(surname).append(" ");
        if (!name.isEmpty()) {
            sb.append(name);
        }
        if (!patronymic.isEmpty()) {
            sb.append(patronymic);
        }
        return sb.toString();
    }
}

