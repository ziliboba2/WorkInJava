package com.classwork.Lesson8;

import java.util.Objects;

public class Person {
    public static int PERSON_COUNT = 0;
    String name;
int id;
    public Person(String name){
        this.name = name;
this.id = ++PERSON_COUNT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
