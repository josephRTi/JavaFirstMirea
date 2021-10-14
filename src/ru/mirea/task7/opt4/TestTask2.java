package ru.mirea.task7.opt4;

import ru.mirea.task7.opt5.MovableCircle;
import ru.mirea.task7.opt6.MovablePoint;
import ru.mirea.task7.opt6.MovableRectangle;

public class TestTask2
{
    public static void main(String[] args) {
        System.out.println("MovablePoint class test");
        MovablePoint point = new MovablePoint(5, 4, 5, 6);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        System.out.println("MovableCircle class test");
        MovableCircle circle = new MovableCircle(5, 4, 2, 1, 4);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);

        System.out.println("MovableRectangle class test");
        MovableRectangle rectangle = new MovableRectangle(10, 5, 2, 2, 3, 3);
        System.out.println(rectangle);
        rectangle.moveLeft();
        rectangle.moveUp();
        System.out.println(rectangle);
        System.out.println(rectangle.isEqualSpeed());

    }
}
