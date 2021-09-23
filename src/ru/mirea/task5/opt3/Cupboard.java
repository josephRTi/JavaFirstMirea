package ru.mirea.task5.opt3;

public class Cupboard extends Furniture {
    String shop;
    public Cupboard(double cost, String shop){
        this.cost = cost;
        this.shop = shop;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Сupboard{" +
                "shop='" + shop + '\'' +
                "cost='" + cost + '\'' +
                '}';
    }
}
