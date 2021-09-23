package ru.mirea.task3.opt3;

public class Book {
    private Book() {};
    String author, name;
    int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Object <Book>: {\nauthor: " + getAuthor() + "\nname: " + getName() + "\nyear: " + getYear() + " };\n";
    }
}
