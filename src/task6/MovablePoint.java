package task6;

public class MovablePoint implements Movable {
    private final int xSpeed;
    private final int ySpeed;
    private int x;
    private int y;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", x, y);
    }

    public int xSpeed() {
        return xSpeed;
    }

    public int ySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
}
