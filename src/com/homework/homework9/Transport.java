package com.homework.homework9;

public class Transport
{
    public int weight ;
    public int length;
    public int speed;
    public Transport(int weight, int length, int speed)
    {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "weight=" + weight +
                ", length=" + length +
                '}';
    }
}
