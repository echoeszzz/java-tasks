package task5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

abstract class Shape {
    public int x, y;
    public int width, height;
    Color color;

    public int randInt(int min, int max) {
        Random rnd = new Random();
        return min + rnd.nextInt(max - min);
    }

    public Color randomColor() {
        Color[] colors = new Color[]{new Color(0, 255, 0), new Color(0, 255, 255), new Color(0, 169, 255), new Color(106, 0, 255), new Color(200, 50, 255), new Color(255, 60, 200), new Color(205, 30, 30)};
        return colors[randInt(0, colors.length)];
    }

    public void randomFill() {
        this.x = randInt(20, 380);
        this.y = randInt(20, 180);
        this.width = randInt(10, 40);
        this.height = randInt(10, 40);
        this.color = randomColor();
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    @Override
    public void randomFill() {
        super.randomFill();
        this.width = this.height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(x, y, width, height);
    }
}

class Rectangle extends Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, height);
    }
}

class ShapesGUI extends JFrame {

    public static void main(String[] args) {
        var window = new ShapesGUI();
    }
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapesGUI() {
        super("Shapes");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400, 210);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        makeShapesList();
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    private void makeShapesList() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int q = 1 + r.nextInt(2);
            if (q == 1) {
                addRectangle();
            } else {
                addCircle();
            }
        }
    }

    public void addRectangle() {
        Rectangle rect = new Rectangle();
        rect.randomFill();
        shapes.add(rect);
    }

    public void addCircle() {
        Circle circle = new Circle();
        circle.randomFill();
        shapes.add(circle);
    }
}

