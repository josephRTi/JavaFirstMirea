package ru.mirea.task2.opt4;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAgeHuman() {
        return this.getAge() * 7;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Object <Dog>: {\nname: " + getName() + "\nage: " + getAge() + "\nage (human): " + getAgeHuman() + " };\n";
    }
}
