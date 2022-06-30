package com.homework.homework9;

public class Train extends Transport{
    public Train(int weight, int length, int speed) {
        super(weight, length, speed);
    }

    @Override
    public void go() {
        System.out.println("the train ran on rails");
    }

    private void horn(){
        System.out.println("choo choo");
    }

    public void privetMethod(){
        horn();
    }
}
