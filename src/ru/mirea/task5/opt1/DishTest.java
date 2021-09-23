package ru.mirea.task5.opt1;

import java.util.Scanner;

public class DishTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r, cost;
        System.out.print("Радиус тарелки: ");
        r = in.nextDouble();
        System.out.print("Стоимость тарелки: ");
        cost = in.nextDouble();
        Plate plate = new Plate(r, cost);
        System.out.println(plate);

        int num_of;
        System.out.print("Количество зубчиков вилки: ");
        num_of = in.nextInt();
        Folk folk = new Folk(num_of);
        System.out.println(folk);
    }
}
