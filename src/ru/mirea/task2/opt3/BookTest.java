package ru.mirea.task2.opt3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int number_of_pages, price;

        System.out.print("Введите название вашей книги: ");
        name = in.nextLine();
        System.out.print("\nКоличество страниц вашей книги: ");
        number_of_pages = in.nextInt();
        while (number_of_pages <= 0) {
            System.out.print("\nКоличество страниц вашей книги (>0): ");
            number_of_pages = in.nextInt();
        }
        System.out.print("\nВведите стоимость вашей книги: ");
        price = in.nextInt();
        while (price <= 0) {
            System.out.print("\nВведите стоимость вашей книги (>0): ");
            price = in.nextInt();
        }

        Book myBook = new Book(name, number_of_pages, price);

        System.out.println(myBook.toString());
    }
}
