package com.classwork.Lesson6;

public class Human implements Runnable,Swimmable{
    @Override
    public void run() {
        System.out.println("human  run");
    }

    @Override
    public void swim() {
        System.out.println("human swim");
    }
}
