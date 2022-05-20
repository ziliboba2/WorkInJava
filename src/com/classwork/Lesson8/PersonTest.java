package com.classwork.Lesson8;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Kolya");

        A obj = new A(2,3);
        A obj1 = new A(4,1);
        A obj2 = new A(5,0);

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
