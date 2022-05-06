package com.homework.homework8;

import java.util.Scanner;

public class Maim {
    public static void main(String[] args) {
        Person person = new Person("Oleg", 14);
        Person.Account account = new Person.Account(454647);
        Scanner scanner = new Scanner(System.in);


        int text = 0;
        while (text != account.password) {
            System.out.println("Введите пароль");
            text = scanner.nextInt();
        }
        System.out.println("Добро пожаловать!");
        account.displayAccount();
    }
}
