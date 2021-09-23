package ru.mirea.task3.opt1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r;

        System.out.print("Введите радиус окружности: ");
        r = in.nextDouble();
        while (r <= 0) {
            System.out.print("\nВведите радиус окружности (>0): ");
            r = in.nextDouble();
        }

        Circle myDog = new Circle(r);

        System.out.println(myDog.toString());
    }
}
