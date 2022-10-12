package Task2;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double xDist, double yDist) {
        this.x += xDist;
        this.y += yDist;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}

class Circle1 {
    private Point center;
    private double radius;

    public Circle1(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle1(double posX, double posY, double radius) {
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

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}

class Tester {
    private static Circle1[] circles;
    private static int circlesAmount;

    public Tester(Circle1[] circles) {
        Tester.circles = circles;
        circlesAmount = circles.length;
    }

    private static void printAllCircles() {
        for (int i = 0; i < circlesAmount; i++) {
            System.out.format("Circle #%s: %s%n", i, circles[i]);
        }
    }

    public static void main(String[] args) {
        circles = new Circle1[]{new Circle1(12., 13, 1), new Circle1(1., 2., 3.)};
        circlesAmount = 2;
        printAllCircles();
    }
}

