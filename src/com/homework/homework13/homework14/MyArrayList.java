package com.homework.homework13.homework14;

import java.util.Arrays;

public class MyArrayList {
    int index;


    public MyArrayList(int index) {
        this.index = index;

    }

    String[] strings = new String[index];

    public String[] getStrings() {
        return strings;
    }

    public void get(int index) {
        System.out.println(strings[index]);
    }

    public void remove(int index) {
        strings[index] = "";

    }

    public void add(int index, String text){
        if(strings[index] == null)
        {
            strings[index] = text;
        }
        else
        {
            System.out.println("This index already using");
        }

    }

    public void set(int index, String string){
        strings[index] = string;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }
}

