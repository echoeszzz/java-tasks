package Task2;

public class Circle {
    private double radius;
    private double diameter;
    private double area;
    private double length;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = Math.PI * radius * radius;
        this.length = 2 * Math.PI * radius;
    }

    public Circle() {
        this.radius = 1;
        this.diameter = 2;
        this.area = Math.PI;
        this.length = 2 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = Math.PI * radius * radius;
        this.length = 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
        this.area = Math.PI * radius * radius;
        this.length = 2 * Math.PI * radius;
    }

    public double getArea() {
        return area;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Радиус = " + radius + ",\nДиаметр = " + diameter + ",\nПлощадь = " + area + ",\nДлина = " + length + ";\n";
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.setRadius(10);
        System.out.println(circle);
        circle.setDiameter(30);
        System.out.println(circle);
    }
}
