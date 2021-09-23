package ru.mirea.task5.opt3;

public class Chair extends Furniture{
    String color;
    public Chair(double cost, String color) {
        this.color = color;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Сhair{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
