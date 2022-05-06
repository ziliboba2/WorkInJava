package com.classwork.Lesson6;

public class King extends Cheesitem{
    public King(int x,int y)
    {
        super(x,y,100);
    }

    @Override
    public void draw() {
        System.out.println("draw king");
    }
}
