package ru.mirea.task5.opt2;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Кличка добермана: ");
        String name = in.nextLine();
        System.out.print("Возраст добермана: ");
        int age = in.nextInt();
        in.nextLine();
        Doberman doberman = new Doberman(name, age);
        System.out.println(doberman);
        System.out.println("");
        System.out.print("Кличка хаски: ");
        name = in.nextLine();
        System.out.print("Возраст добермана: ");
        age = in.nextInt();
        Haski haski = new Haski(name, age);
        System.out.print(haski);
    }
}
