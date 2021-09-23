package ru.mirea.task5.opt1;

public class Folk extends Dish {
    int num_of;

    public Folk(int num_of) {
        this.num_of = num_of;
    }

    public int getNum_of() {
        return num_of;
    }

    public void setNum_of(int num_of) {
        this.num_of = num_of;
    }

    @Override
    public String toString() {
        return "Folk{" +
                "Количество зубчиков=" + num_of +
                '}';
    }
}
