package com.classwork.Lesson6;

public class Pawn extends Cheesitem{
    public Pawn(int x, int y)
    {
        super(x, y, 10);
    }

    @Override
    public void draw() {
        System.out.println("draw pawn");
    }
}
