package ru.mirea.task3.opt3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String author, name;
        int year;

        System.out.print("Введите автора книги: ");
        author = in.nextLine();
        System.out.print("Введите название книги: ");
        name = in.nextLine();
        System.out.print("Введите год написания книги: ");
        year = in.nextInt();
        while (year <= 0) {
            System.out.print("Введите год написания книги (>0): ");
            year = in.nextInt();
        }

        Book myBook = new Book(author, name, year);

        System.out.println(myBook);
    }
}
