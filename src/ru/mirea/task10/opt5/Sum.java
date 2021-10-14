package ru.mirea.task10.opt5;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.println("Сумма цифр введенного числа: " + SumOfNumbers(n));
    }

    static int SumOfNumbers(int n) {
        int sc = 0;
        if (n > 9) {
            sc = n % 10 + SumOfNumbers(n / 10);
        } else
            sc = n;
        return sc;
    }
}
