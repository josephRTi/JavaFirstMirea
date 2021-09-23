package ru.mirea.task4.opt2;

import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;

        System.out.print("Введите координату X: ");
        x = in.nextDouble();
        System.out.print("Введите координату Y: ");
        y = in.nextDouble();
        Ball myBall = new Ball(x, y);
        System.out.println(myBall);
        System.out.print("Переместить координату X на: ");
        x = in.nextDouble();
        System.out.print("Переместить координату Y на: ");
        y = in.nextDouble();
        myBall.move(x, y);
        System.out.println(myBall);
    }
}
