package ru.mirea.task2.opt5;

import ru.mirea.task2.opt4.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество собак: ");
        int n;
        n = in.nextInt();
        in.nextLine();
        ArrayList<Dog> arDog = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            String name;
            int age;
            System.out.print("Введите кличку собаки: ");
            name = in.nextLine();
            System.out.print("Введите возраст собаки: ");
            age = in.nextInt();
            in.nextLine();
            arDog.add(arDog.size(), new Dog(name, age));
        }

        for(int i = 0; i < arDog.size(); ++i) {
            System.out.println(arDog.get(i).toString());
        }
    }
}
