package task6;

public interface Priceable {
    float price();
}

record Car(float price) implements Priceable {
}

record Ticket(float price) implements Priceable {

}

class TestPriceable {
    public static void main(String[] args) {
        var car1 = new Car(15000);
        var car2 = new Car(50000);

        var ticket1 = new Ticket(50);
        var ticket2 = new Ticket(15);

        System.out.println(car1.price());
        System.out.println(car2.price());
        System.out.println(ticket1.price());
        System.out.println(ticket2.price());
    }
}