package task2;

import java.util.Objects;
import java.util.Scanner;

class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Shop {
    private Computer[] computers;

    public Shop() {
        computers = new Computer[1];
    }

    public Shop(Computer[] computers) {
        this.computers = computers;
    }


    public void enterComputers() {
        int amount;
        String tempName;
        var sc = new Scanner(System.in);
        System.out.print("Enter computers amount >> ");
        amount = sc.nextInt();
        computers = new Computer[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print("Enter name of computer >> ");
            tempName = sc.nextLine();
            computers[i] = new Computer(tempName);
        }
    }

    public Computer findComputer(String name) {
        for (var computer : computers) {
            if (Objects.equals(computer.getName(), name)) {
                return computer;
            }
        }
        return new Computer("null");
    }
}

class ShopTester {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var shop = new Shop();
        shop.enterComputers();
        System.out.print("Enter name of computer >> ");
        var name = sc.nextLine();
        var foundedComputer = shop.findComputer(name);
        System.out.format("You found a computer named %s", foundedComputer.getName());
    }
}