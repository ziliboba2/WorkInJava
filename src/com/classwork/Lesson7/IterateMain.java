package com.classwork.Lesson7;

import java.util.ArrayList;
import java.util.List;

public class IterateMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.print(list.get(j) + " ");
        }

        System.out.println(list);
        //show list
        for (Integer number: list)
        {
            System.out.print(number + " ");
        }

        System.out.println("is 7 exist in collection ?" + list.contains(7));
    }
}
