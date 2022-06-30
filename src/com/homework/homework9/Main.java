package com.homework.homework9;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(2424,300, 120);
        Plane plane = new Plane(300,200,200,3000);
        train.go();
        plane.go();
        train.privetMethod();
        train.privetMethod();
     plane.privetMethod();

    }
}
