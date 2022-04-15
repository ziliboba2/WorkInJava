package com.homework;

import java.util.Objects;

public class Person {
public String firstName;
public String lastName;
public int password;
public Person()
{
    firstName = "Guest";
    lastName = "unknown";
    password = 10101;
}
public Person(String firstName, String lastName, int password)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
}


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Person))
            return false;
        Person person = (Person) obj;

        return Objects.equals(this.firstName, person.firstName) && this.password == person.password;
    }

        @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password=" + password +
                '}';
    }
}
