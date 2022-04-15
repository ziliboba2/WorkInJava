package com.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Guest
{
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();
        //Scanner scanner = new Scanner(System.in);

        Person ziliboba = new Person("Nazar", "Chernokulsky", 43451);
        person.add(ziliboba);
      Person nastya = new Person("Nastya", "Bugenenko", 55667);
person.add(nastya);
      Person vadim = new Person("Vadim", "Chernenko", 66556);
      person.add(vadim);
      Person alina =new Person("Alina", "Kolkina", 78872);
      person.add(alina);
      Person guest = new Person();
      person.add(guest);
        for(Person people : person){

            System.out.println(people);
        }
        System.out.println("Сравнение 3 и 4 акаунта: " + vadim.equals(guest));
    }
}
