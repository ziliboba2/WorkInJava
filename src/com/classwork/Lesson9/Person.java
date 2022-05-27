package com.classwork.Lesson9;

public class Person implements Comparable<Persons>{
    String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Persons o) {
        return name.compareTo(o.getName);
    }
}
