package task4;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        number = "11111111111";
        model = "empty";
        weight = 0.0;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String nameOfCaller) {
        System.out.println("Звонит " + nameOfCaller);
    }

    public void receiveCall(String nameOfCaller, String numberOfCaller) {
        System.out.println("Звонит " + nameOfCaller + " " + numberOfCaller);
    }

    public void sendMessage(String... numbers) {
        System.out.println(this.number + " send message to:");
        for (var number : numbers) {
            System.out.println(number);
        }
    }

    public String getNumber() {
        return number;
    }
}

class PhoneTester {
    public static void main(String[] args) {
        var phone1 = new Phone("89999999999", "iphone", 1.2);
        var phone2 = new Phone("81111111111", "samsung", 1.1);
        var phone3 = new Phone("87777777777", "nokia", 10.1);
        System.out.println("phone1: " + phone1);
        System.out.println("phone2: " + phone2);
        System.out.println("phone3: " + phone3);

        phone1.receiveCall("ivan");

        System.out.println("number phone1: " + phone1.getNumber());
        System.out.println("number phone2: " + phone2.getNumber());
        System.out.println("number phone3: " + phone3.getNumber());

        phone2.receiveCall("ivan", "8999912812931283");

        phone3.sendMessage("89123123123", "12371263781", "129367129381");
    }
}