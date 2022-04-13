package com.classwork;

public class Orange extends Plant
{
    private int age;
    public Orange(int age)
    {
        super(300,"Rutovi");
        this.age = age;
        System.out.println("create orange");
    }

    public int getAge() {
        return age;
    }

    public void photosynthesis()
    {
        super.photosynthesis();
        System.out.println("Orange age " + age);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "age=" + age +
                ", height=" + height +
                ", family='" + family + '\'' +
                '}';
    }
}
