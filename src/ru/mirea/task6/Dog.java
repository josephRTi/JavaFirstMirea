package ru.mirea.task6;

public class Dog implements Nameable{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }
}
