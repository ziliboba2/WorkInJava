package com.classwork.Lesson9;

import java.util.Comparator;
import java.util.TreeSet;

public class Birds {
    public static void main(String[] args) {
        Comparator<Bird> comparator = new BirdComporator();
        TreeSet<Bird> birds = new TreeSet<>(comparator.reversed());
        birds.add(new Bird("blue"));
        birds.add(new Bird("yellow"));
        birds.add(new Bird("red"));
        System.out.println(birds);
    }
}
