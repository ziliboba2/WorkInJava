package com.classwork;

public class Plant
{
    protected final int height;
    protected final String family;

    public Plant(int height, String family)
    {
        this.height = height;
        this.family = family;
        System.out.println("Create plant");
    }

    public int getHeight() {
        return height;
    }

    public void photosynthesis()
    {
        System.out.println("photosynthesis" + this);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", family='" + family + '\'' +
                '}';
    }
}
