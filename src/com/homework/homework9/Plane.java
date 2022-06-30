package com.homework.homework9;

public class Plane extends Transport {
    public Plane(int weight, int length, int speed, int flightAltitude) {
        super(weight, length, speed);
    }

    public void go() {
        System.out.println("the plane took off");
    }

    private void autoPilot(){
        System.out.println("Auto pilot on");
    }

    public void privetMethod(){
        autoPilot();
    }
}
