package ru.mirea.task6;

public class Human implements Nameable {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }
}
