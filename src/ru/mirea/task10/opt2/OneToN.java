package ru.mirea.task10.opt2;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        for(int i = 1; i <= n; ++i){
            System.out.print(i + " ");
        }
    }
}
