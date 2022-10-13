package Task4;

import java.util.Arrays;

public class Reader {
    private String fullName;
    private String readerTickerNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, String readerTickerNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTickerNumber = readerTickerNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {
        System.out.println(fullName + " взял книгу");
    }

    public void returnBook() {
        System.out.println(fullName + " вернул книгу");
    }

    public void takeBook(int amountOfBooks) {
        System.out.println(fullName + " взял " + amountOfBooks + "книг");
    }

    public void takeBook(String... books) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(books));
    }
    public void returnBook(String... books) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(books));
    }
}
