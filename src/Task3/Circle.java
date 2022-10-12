package Task3;

import Task2.Point;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Circle implements Comparable {
    private Point center;
    private double radius;

    public Circle() {
        center = new Point(Math.random() * 100, Math.random() * 100);
        radius = Math.random() * 100;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double posX, double posY, double radius) {
        this.center = new Point(posX, posY);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }

    @Override
    public int compareTo(Object o) {
        var circle = (Circle) o;
        return Double.compare(this.getArea(), ((Circle) o).getArea());
    }
}

class Tester {
    static Circle findMin(Circle[] arr) {
        return (Circle) Arrays.stream(arr).sorted().toArray()[0];
    }

    static Circle findMax(Circle[] arr) {
        return (Circle) Arrays.stream(arr).sorted().toArray()[arr.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of circles >> ");
        int amount = sc.nextInt();
        Circle[] circles = new Circle[amount];
        for (int i = 0; i < amount; ++i) {
            circles[i] = new Circle();
        }

        System.out.format("The smallest circle is: %s, area is %s%n", findMin(circles), findMin(circles).getArea());
        System.out.format("The biggest circle is: %s, area is %s%n", findMax(circles), findMax(circles).getArea());

        var sortedCircles = Arrays.stream(circles).sorted().toArray();
        for (int i = 0; i < sortedCircles.length; i++) {
            System.out.format("#%s : %s%n", i + 1, sortedCircles[i]);
        }
    }
}

