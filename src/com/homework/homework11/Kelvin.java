package com.homework.homework11;

public class Kelvin implements Converter {
public int degree;
public double convert;
public Kelvin(int degree)
{
    this.degree = degree;

}
    @Override
    public void covert() {
convert = degree  + 273.15;
        System.out.println(convert);
    }
}
