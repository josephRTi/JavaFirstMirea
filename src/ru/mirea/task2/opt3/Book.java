package ru.mirea.task2.opt3;

public class Book {
    String name;
    int number_of_pages, price;

    public Book(String name, int number_of_pages, int price) {
        this.name = name;
        this.number_of_pages = number_of_pages;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String toString() {
        return "Object <Book>: {\nname: " + getName() + "\nnumber of pages: " + getNumber_of_pages() + "\nprice: " + getPrice() + " };\n";
    }
}
