package com.homework.homework9;

public abstract class Transport
{
    private int weight ;
   private int length;
    private  int speed;
    public Transport(int weight, int length, int speed)
    {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
    }

    private int getLength() {
        return length;
    }

    private int getWeight() {
        return weight;
    }

    private int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setLength(int length) {
        this.length = length;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void go();


    @Override
    public String toString() {
        return "Transport{" +
                "weight=" + weight +
                ", length=" + length +
                '}';
    }
}
