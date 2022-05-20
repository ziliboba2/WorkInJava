package com.homework.homework13;

import java.util.*;

public class Main {
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String text = null;

        while (!Objects.equals(text, "exit")) {
            System.out.println("Выберите действие: add, remove, exit ");
            text = SCANNER.nextLine();
            switch (text) {
                case "add": {
                    adding(list);
                    System.out.println(list);
                    break;
                }
                case "exit":
                {
                    System.out.println(list);
                    System.exit(0);
                }
                case "remove":
                {
                    removing(list);
                }
            }

        }

    }

    public static void adding(List<Product> list) {
        String name;
        int count;
        int weight;
        int price;
        System.out.println("Введите имя продукта");
        name = SCANNER.nextLine();

        System.out.println("Введите количевство");
        count = SCANNER.nextInt();

        System.out.println("Введите вес");
        weight = SCANNER.nextInt();

        System.out.println("Введите цену");
        price = SCANNER.nextInt();

        Product product = new Product(name, count, weight, price);
        list.add(product);
        System.out.println("Продукт успешно добавлен");

    }

    public static void removing(List<Product> list)
    {
        Iterator<Product> productsIterator = list.listIterator();
        String answer;
        boolean search;
        int id;
        System.out.println("Товар под каким именем должен быть удален?");
        answer = SCANNER.nextLine();
      while (productsIterator.hasNext())
      {
          Product nextProduct = productsIterator.next();
          if (nextProduct.name.equals(answer)){
              productsIterator.remove();
              System.out.println("Товар успешно удален");
              return;
          }
        }
        System.out.println("Товара с таким именем нет");

    }

}



