package ru.mirea.task5.opt1;

public class Plate extends Dish {
    double r, cost;

    public Plate(double r, double cost) {
        this.r = r;
        this.cost = cost;
    }

    public double getR() {
        return r;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "r=" + r +
                ", cost=" + cost +
                '}';
    }
}
