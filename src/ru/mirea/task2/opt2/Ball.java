package ru.mirea.task2.opt2;

public class Ball {
    String type;
    int m;
    int price;

    public Ball(String type, int m, int price) {
        this.type = type;
        this.m = m;
        this.price = price;
    }

    public int getM() {
        return m;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Object <Ball>: {\ntype: " + getType() + "\nm: " + getM() + "\nprice: " + getPrice() + " };\n";
    }
}
