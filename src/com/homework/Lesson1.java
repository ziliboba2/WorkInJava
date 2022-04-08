package com.homework;


import java.util.Objects;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 0;
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите первое число: ");
            int number = scanner.nextInt();
            String text = scanner.nextLine();
            first = number;
            if (Objects.equals(text, "стоп")) {
                stop = true;
            }

            System.out.println("Введите второе число: ");

            number = scanner.nextInt();
            text = scanner.nextLine();
            if (Objects.equals(text, "стоп")) {
                stop = true;
            }
            second = number;
            System.out.println("Сумма этих чисел ровна - " + (first + second));
        }

    }
}
