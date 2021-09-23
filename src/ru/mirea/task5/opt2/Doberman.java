package ru.mirea.task5.opt2;

public class Doberman extends Dog {
    public Doberman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
