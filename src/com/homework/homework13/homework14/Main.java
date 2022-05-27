package com.homework.homework13.homework14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       MyArrayList arr = new MyArrayList(9);
        arr.add(0, "text");

        arr.add(1, "text2");

        arr.remove(0);

        arr.set(0, "test 2");

        arr.get(1);

        System.out.println(arr.toString());
    }
}
