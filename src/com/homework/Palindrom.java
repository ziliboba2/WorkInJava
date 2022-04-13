package com.homework;

import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String text;
        String reverse;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите текст: ");
        text = scanner.nextLine();
        text = text.toLowerCase(Locale.ROOT);
        text = text.trim();
        text = text.replaceAll("\\s+", "");
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        reverse = sb.toString();

        if (reverse.equals(text)) {
            System.out.println("Палиндром!");
        } else {
            System.out.println("Не палиндром");
        }

    }
}

