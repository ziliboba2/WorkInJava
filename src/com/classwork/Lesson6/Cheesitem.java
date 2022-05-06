package com.classwork.Lesson6;

public abstract class Cheesitem
{
private int x;
private int y;
private int value;
public Cheesitem(int x, int y, int value)
{
    this.x = x;
    this.y = y;
    this.value = value;
}

    public int getValue() {
        return value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void move(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();


}
