package ru.mirea.task6;

public class Notebook implements Priceable {
    double price;
    public Notebook(double price) {
        this.price = price;
    }

    public void getPrice() {
        System.out.println(price);
    }
}
