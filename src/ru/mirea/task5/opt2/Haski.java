package ru.mirea.task5.opt2;

public class Haski extends Dog {
    public Haski(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Haski{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
