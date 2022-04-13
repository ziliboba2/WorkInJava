package com.classwork.Lesson5;

import com.classwork.Cactus;
import com.classwork.Orange;
import com.classwork.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laboratory {
   public static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        List<Plant> plants = new ArrayList<>();


        System.out.println("choose action: 1.create plant 2.exit");
        String input = SCANNER.nextLine();
        while("create".equals(input)) {

plants.add(createPlant());
input = SCANNER.nextLine();
        }

        for (Plant plant: plants) {
            plant.photosynthesis();
        }
    }






/*
        System.out.println("dandelion height: ");
        int height1 = scanner.nextInt();
        System.out.println("cactus height:");
        int height2 = scanner.nextInt();
        Plant dandelion = new Dandelion(height1);
        plants.add(dandelion);
        Plant cactus = new Cactus(height2);
        plants.add(cactus);

        System.out.println("orange height:");
        int height3 = scanner.nextInt();
        Plant orange = new Orange(height3);
        plants.add(orange);

        for (Plant plant: plants)
        {
            plant.photosynthesis();
        }

 */

public static Plant createPlant()
{
    System.out.println("Input plant type: orange, cactus, dandelion");
    String plantType = SCANNER.nextLine();
    switch (plantType) {
        case "orange":
            System.out.println("Input orange age");
            int age = Integer.parseInt(SCANNER.nextLine());
            return new Orange(age);
        case "cactus":
            System.out.println("Input cactus height");
            int height =Integer.parseInt(SCANNER.nextLine()) ;
            return new Cactus(height);
        case "dandelion":
            System.out.println("Input dendelion height");
            int height2 = Integer.parseInt(SCANNER.nextLine());
            return new Orange(height2);
    }
    return null;
}

}
