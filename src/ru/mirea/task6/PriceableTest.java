package ru.mirea.task6;

import java.util.Scanner;

public class PriceableTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Цена ноутбука: ");
        double price = in.nextDouble();
        Notebook note = new Notebook(price);
        note.getPrice();

        System.out.print("Цена телефона: ");
        price = in.nextDouble();
        Phone phone = new Phone(price);
        phone.getPrice();
    }
}
