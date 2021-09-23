package ru.mirea.task2.opt2;

import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type;
        int m, price;

        System.out.print("Введите тип вашего мяча: ");
        type = in.nextLine();
        System.out.print("\nВведите массу вашего мяча: ");
        m = in.nextInt();
        while (m <= 0) {
            System.out.print("\nВведите массу вашего мяча (>0): ");
            m = in.nextInt();
        }
        System.out.print("\nВведите стоимость вашего мяча: ");
        price = in.nextInt();
        while (price <= 0) {
            System.out.print("\nВведите стоимость вашего мяча (>0): ");
            price = in.nextInt();
        }

        Ball myBall = new Ball(type, m, price);

        System.out.println(myBall.toString());
    }
}
