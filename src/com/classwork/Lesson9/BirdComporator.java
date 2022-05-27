package com.classwork.Lesson9;

import java.util.Comparator;

public class BirdComporator implements Comparator<Bird> {




    @Override
    public int compare(Bird o1, Bird o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
