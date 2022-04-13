package com.classwork;

public class Dandelion extends Plant {
    public Dandelion(int height) {
        super(height, "Dandelion");
        System.out.println("Create dandelion");
    }
// так как метод переопределен в дочернем классе
    @Override
    public void photosynthesis() {
        System.out.println("dandelion photosynthesis " + this.height);

    }
}
