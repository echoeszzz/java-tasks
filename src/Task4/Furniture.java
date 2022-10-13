package Task4;

public abstract class Furniture {
    private String material;
    private double price;
    private double size;

    public Furniture(String material, double price, double size) {
        this.material = material;
        this.price = price;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}

class Chair extends Furniture {

    private boolean is_occupied;

    public Chair(String material, double price, double size) {
        super(material, price, size);
        is_occupied = false;
    }

    public void sitDown() throws RuntimeException {
        if (is_occupied) {
            throw new RuntimeException("Стул занят!");
        } else {
            is_occupied = true;
        }
    }

    public void standUp() throws RuntimeException {
        if (!is_occupied) {
            throw new RuntimeException("Никто не может встать со стула, так как тут никто не сидит!");
        } else {
            is_occupied = false;
        }
    }

    @Override
    public String toString() {
        if (is_occupied) {
            return "This chair is occupied";
        } else {
            return "This chair is free";
        }
    }
}

class Table extends Furniture {

    public Table(String material, double price, double size) {
        super(material, price, size);
    }

}

class TestFurniture {
    public static void main(String[] args) {

    }
}