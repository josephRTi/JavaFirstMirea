package ru.mirea.task5.opt3;

import java.util.Scanner;

public class FurnitureTest {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Стоимость шкафа: ");
        double cost = in.nextDouble();
        in.nextLine();
        System.out.print("Магазин покупки: ");
        String shop = in.nextLine();
        Cupboard cupboard = new Cupboard(cost, shop);
        System.out.println(cupboard);
        System.out.println();
        System.out.print("Стоимость стула: ");
        cost = in.nextDouble();
        in.nextLine();
        System.out.print("Цвет стула: ");
        String color = in.nextLine();
        Chair chair = new Chair(cost, color);
        System.out.println(chair);
    }
}
