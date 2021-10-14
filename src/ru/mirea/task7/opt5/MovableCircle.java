package ru.mirea.task7.opt5;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.y += center.ySpeed;
    }

    public void moveDown() {
        center.y -= center.ySpeed;
    }

    public void moveRight() {
        center.x += center.xSpeed;
    }

    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
