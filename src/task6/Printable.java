package task6;

import java.util.ArrayList;
import java.util.Arrays;

public interface Printable {
    void print();
}

class Book implements Printable {

    private String name;
    private String authorName;
    private String allText;

    public Book(String name, String authorName, String allText) {
        this.name = name;
        this.authorName = authorName;
        this.allText = allText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAllText() {
        return allText;
    }

    public void setAllText(String allText) {
        this.allText = allText;
    }

    @Override
    public void print() {
        System.out.format("Author: %s\nName of book: %s\nText of book:\n%s\n", this.authorName, this.name, this.allText);
    }
}

class Shop implements Printable {
    private String name;
    private String[] products;

    public Shop(String name, String[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products.toArray(new String[0]);
    }

    @Override
    public void print() {
        System.out.format("Shop \"%s\"\nProducts: %s\n", this.name, Arrays.toString(this.products));
    }
}