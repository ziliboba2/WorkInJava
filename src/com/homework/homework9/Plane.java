package com.homework.homework9;

public class Plane extends Transport{
    public Plane(int weight, int length, int speed, int flightAltitude) {
        super(weight, length, speed);
    }
    private void flight()
    {
        System.out.println("the plane took off");
    }
}
