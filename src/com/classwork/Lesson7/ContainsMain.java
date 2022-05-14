package com.classwork.Lesson7;

import java.util.*;

public class ContainsMain {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);;
        String text = null;

   while (!Objects.equals(text, "стоп")){
       System.out.println("Введите слово для колекции");
       text = scanner.nextLine();
       text.toLowerCase(Locale.ROOT);

       if (words.contains("війна"))
       {
           System.out.println("Это запрещенное слово, введите другое");
           words.remove("війна");

       }
       words.add(text);

   }
   words.remove("стоп");
        System.out.println(words);
    }
}
