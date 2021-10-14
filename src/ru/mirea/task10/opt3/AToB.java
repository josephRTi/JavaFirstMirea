package ru.mirea.task10.opt3;

import java.util.Scanner;

public class AToB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите А: ");
        int a = in.nextInt();
        System.out.println("Введите В: ");
        int b = in.nextInt();

        if (a < b) {
            for(int i = a; i <= b; ++i) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; --i)
                System.out.print(i + " ");
        }
    }
}
