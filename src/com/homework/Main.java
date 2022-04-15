package com.homework;

public class Main
{
    public static void main(String[] args) {
        Helpers.DistanceHelper dh = new Helpers.DistanceHelper();
        Helpers.MathHelper mh = new Helpers.MathHelper();
        dh.calculateDistance(2,3,4,5);
        System.out.println( (float) dh.calculateDistance(2,3,4,5));
        System.out.println(mh.sum(4, 6));
    }
}
