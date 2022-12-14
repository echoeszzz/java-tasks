package task29;

import java.io.Serializable;
import java.util.Objects;

public final class Dish implements Item, Serializable {
    private final int price;
    private final String name;
    private final String description;


    public Dish(int price, String name, String description) {
        if (description.isEmpty() || price < 0 || name.isEmpty()) {
            throw new java.lang.IllegalArgumentException();
        }

        this.description = description;
        this.price = price;
        this.name = name;

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (Dish) obj;
        return this.price == that.price && Objects.equals(this.name, that.name)
                && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, description);
    }

    @Override
    public String toString() {
        return "Dish[" + "Price=" + price + ", " + "Name=" + name + ", " + "Discription="
                + description + ']';
    }


}