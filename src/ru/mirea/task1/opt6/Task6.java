package ru.mirea.task1.opt6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("task 6");
        System.out.println("Первый способ (Math)");
        int[] myNum = new int[100];
        for(int i = 0; i < myNum.length; ++i) {
            myNum[i] = (int)(Math.random() * 1000);
        }
        for(int i = 0; i < myNum.length; ++i) {
            System.out.print(myNum[i] + " ");
        }
        System.out.print('\n');
        Arrays.sort(myNum);
        for(int i = 0; i < myNum.length; ++i) {
            System.out.print(myNum[i] + " ");
        }
        System.out.print('\n');
        System.out.println("Второй способ (Random)");
        Random random = new Random();
        for(int i = 0; i < myNum.length; ++i) {
            myNum[i] = random.nextInt() % 1000;
        }
        for(int i = 0; i < myNum.length; ++i) {
            System.out.print(myNum[i] + " ");
        }
        System.out.print('\n');
        Arrays.sort(myNum);
        for(int i = 0; i < myNum.length; ++i) {
            System.out.print(myNum[i] + " ");
        }
        System.out.print('\n');
    }
}
