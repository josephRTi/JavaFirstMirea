package ru.mirea.task10.opt1;

import java.util.Scanner;

public class TriangleSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        for(int i = 1; i <= n; ++i) {
            for(int j = 0; j < i; ++j) {
                System.out.print(i + " ");
            }
        }
    }
}
