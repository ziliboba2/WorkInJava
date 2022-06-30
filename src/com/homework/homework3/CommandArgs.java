package com.homework.homework3;

public class CommandArgs {
    public static void main(String[] args) {
       switch (args[1]){
           case ("*"):
           {
               int value;
               value = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
               System.out.println("Результат " + value);
               break;
           }
           case ("+"):
           {
               int value;
               value = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
               System.out.println("Результат " + value);
               break;
           }
           case ("-"):
           {
               int value;
               value = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
               System.out.println("Результат " + value);
               break;
           }
           case ("/"):
           {
               int value;
               value = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
               System.out.println("Результат " + value);
               break;
           }
       }

    }
}
