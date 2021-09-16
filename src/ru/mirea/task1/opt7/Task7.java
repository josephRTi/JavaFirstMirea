package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("task 7");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
        System.out.println("Тестирование: ");
        System.out.println("5!");
        System.out.println("Ожидаемые выходные данные: 120");
        System.out.println("Выходные данные: " + factorial(5));
        System.out.println("8!");
        System.out.println("Ожидаемые выходные данные: 40320");
        System.out.println("Выходные данные: " + factorial(8));
        System.out.println("10!");
        System.out.println("Ожидаемые выходные данные: 3628800");
        System.out.println("Выходные данные: " + factorial(10));
    }

    public static int factorial(int n) {
        int res = 1;
        for(int i = 1; i <= n; ++i) {
            res *= i;
        }
        return res;
    }
}
