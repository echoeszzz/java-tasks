package Task2;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class TestAuthor {
    public static void main(String[] args) {
        var author1 = new Author("Pushkin", "pushkin@main.ru", 'm');
        var author2 = new Author("Lermontov", "lermontov@main.ru", 'm');
        System.out.println("author1: " + author1);
        System.out.println("author2: " + author2);

        author1.setEmail("dantes@mail.ru");
        System.out.println("author1 after changing email: " + author1);
    }
}