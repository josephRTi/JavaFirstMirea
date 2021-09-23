package ru.mirea.task2.opt4;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Введите кличку вашей собаки: ");
        name = in.nextLine();
        System.out.print("Возраст вашей собаки: ");
        age = in.nextInt();
        while (age <= 0) {
            System.out.print("Количество страниц вашей книги (>0): ");
            age = in.nextInt();
        }

        Dog myDog = new Dog(name, age);

        System.out.println(myDog);
    }
}
