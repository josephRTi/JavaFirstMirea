package ru.mirea.task4.opt1;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, email;
        char gender;

        System.out.print("Введите имя автора: ");
        name = in.nextLine();
        System.out.print("Введите email: ");
        email = in.nextLine();
        System.out.print("Введите пол: ");
        gender = in.next().charAt(0);

        Author author = new Author(name, email, gender);

        System.out.println(author);
    }
}
