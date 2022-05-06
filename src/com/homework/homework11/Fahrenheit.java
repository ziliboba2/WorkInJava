package com.homework.homework11;

public class Fahrenheit implements Converter{
    int degrees;
    int convert;
    public Fahrenheit(int degrees)
    {
        this.degrees = degrees;
    }
    @Override
    public void covert() {
     convert = (degrees * 9/5) + 32;
        System.out.println(convert);
    }
}
