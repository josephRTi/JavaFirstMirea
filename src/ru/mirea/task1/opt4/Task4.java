package ru.mirea.task1.opt4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("task 4");
        Scanner sc = new Scanner(System.in);
        int[] numericArray2 = new int[5];
        for (int i = 0; i < 5; i++) {
            numericArray2[i] = sc.nextInt();
        }
        for (int value : numericArray2) {
            System.out.print(value + ";");
        }
    }
}
