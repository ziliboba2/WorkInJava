package com.classwork.Lesson9;

public class Bird {
    public String color;

    public Bird(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                '}';
    }
}
