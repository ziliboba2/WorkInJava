package com.classwork.Lesson6;

import java.util.ArrayList;

public class Chess {
    public static void main(String[] args) {

        ArrayList<Cheesitem> items = new ArrayList<>();
        Cheesitem pawn1 = new Pawn(1, 2);
        items.add(pawn1);

        Cheesitem pawn2 = new Pawn(1, 1);
        items.add(pawn2);

        Cheesitem pawn3 = new Pawn(1, 4);
        items.add(pawn3);

        Cheesitem pawn = new Pawn(1, 3);
        items.add(pawn);

        Cheesitem king = new King(6, 1);
        items.add(king);

        Cheesitem queen = new Queen(5, 1);
        items.add(queen);

        for (Cheesitem item : items) {
            item.draw();
        }




    }
}
