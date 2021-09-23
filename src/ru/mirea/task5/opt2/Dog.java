package ru.mirea.task5.opt2;

public class Dog {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void foo() {
        System.out.println("A foo from abstract class");
    }
}
