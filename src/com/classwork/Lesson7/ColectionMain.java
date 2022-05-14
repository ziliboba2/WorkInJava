package com.classwork.Lesson7;

import java.util.ArrayList;
import java.util.List;

public class ColectionMain
{
    public static void main(String[] args) {
        //create
        int[] numbersArray = new int[5];
        List<Integer> numbersColl = new ArrayList<>();
        //get size
        System.out.println(numbersArray.length);
        System.out.println(numbersColl.size());
        //fell
        numbersArray[0] = 1;
        numbersArray[3] = 4;

        numbersColl.add(1);
        numbersColl.add(23);
//set
        numbersColl.set(0, 100);
        //
        System.out.println(numbersArray[3]);
        System.out.println(numbersColl.get(0));
        //remove
        numbersColl.remove(0);
        System.out.println(numbersColl.get(0));
    };
}
