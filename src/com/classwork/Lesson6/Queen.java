package com.classwork.Lesson6;

public class Queen extends Cheesitem{
    public Queen(int x, int y)
    {
        super(x,y,100);
    }

    @Override
    public void draw() {
        System.out.println("draw queen");
    }
}
