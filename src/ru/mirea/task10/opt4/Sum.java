package ru.mirea.task10.opt4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fsum = 0, fcnt = 0, scnt = 0;

        System.out.println("Введите K (количество цифр в числе): ");
        fcnt = in.nextInt();

        System.out.println("Введите сумму цифр: ");
        fsum = in.nextInt();

        int i = (int)Math.pow(10, fcnt - 1);
        while (i < Math.pow(10, fcnt)) {
            int ssum = 0, num = i;

            while (num != 0) {
                ssum += num % 10;
                num /= 10;
            }

            if (ssum == fsum) {
                scnt++;
            }
            i++;
        }
        System.out.println("Количество таких чисел: " + scnt);
    }
}
