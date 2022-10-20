package task2;

public class Book {
    private String name;
    private int year;
    private String author;

    public Book(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
        this.author = "Unknown";
    }

    public Book(String name) {
        this.name = name;
        this.year = 0;
        this.author = "Unknown";
    }

    public Book() {
        this.name = "Unknown";
        this.year = 0;
        this.author = "Unknown";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book: " +
                "named '" + name + '\'' +
                ", year " + year +
                ", author is '" + author + '\'';
    }
}

class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 1997, "J.K. Rowling");
        Book book2 = new Book("Lord of the Rings", 1954);
        Book book3 = new Book("The Hobbit");
        book3.setAuthor("J. R. R. Tolkien");
        book3.setYear(1937);
        Book book4 = new Book();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}