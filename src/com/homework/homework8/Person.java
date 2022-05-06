package com.homework.homework8;

public class Person {
    public static String name;
    public static int old;


    public Person(String name, int old) {
        Person.name = name;
        Person.old = old;
    }

    public static class Account {
        public final int password;

        public Account(int password) {
            this.password = password;
        }

        public void displayAccount() {


            System.out.println(Person.name);
            System.out.println("Количество лет:" + old);

        }

        public int getPassword() {
            return password;
        }

    }


}
