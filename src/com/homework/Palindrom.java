package com.homework;

import java.util.Locale;
import java.util.Scanner;

public class Palindrom
{
    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите текст: ");
        text = scanner.nextLine();
        text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(0) == text.charAt( (text.length() - 1) ))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("Не палиндром!");
                System.exit(1);
            }
        }
        System.out.println("Палиндром!");
    }
}

