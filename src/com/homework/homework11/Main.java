package com.homework.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Во что вы хотите конвертировать?: 1.Келвины 2.Фаренгейты");
        int text = scanner.nextInt();
        System.out.println("Введите градусы в Цельсиях: ");
        int deegre = scanner.nextInt();
        switch (text) {
            case 1:
                Kelvin kelvin = new Kelvin(deegre);

                kelvin.covert();
                break;
            case 2:
                Fahrenheit fahrenheit = new Fahrenheit(deegre);
                fahrenheit.covert();
                break;
        }
    }
}
