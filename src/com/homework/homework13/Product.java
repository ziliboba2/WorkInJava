package com.homework.homework13;

public class Product {
     String name;
     int count;
    int weight;
    int price;

    public Product(String name, int count, int weight, int price) {
        this.name = name;
        this.count = count;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
