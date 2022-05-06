package com.classwork.Lesson6;

public class Duck implements Swimmable, Runnable, Flyable{
    @Override
    public void fly() {
        System.out.println("duck fly");
    }

    @Override
    public void run() {
        System.out.println("duck run");
    }

    @Override
    public void swim() {
        System.out.println("duck swim");
    }
}
