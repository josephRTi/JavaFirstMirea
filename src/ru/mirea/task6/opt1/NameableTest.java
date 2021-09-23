package ru.mirea.task6.opt1;

import java.util.Scanner;

public class NameableTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Имя человека: ");
        String name = in.nextLine();
        Human human = new Human(name);
        human.getName();

        System.out.print("Кличка собаки: ");
        name = in.nextLine();
        Dog dog = new Dog(name);
        dog.getName();
    }
}
