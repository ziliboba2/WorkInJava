package com.homework.homework19;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongStatusException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> orderList = new ArrayList<>();
        String stop = null;
        boolean newOrder = true;

        while (!Objects.equals(stop, "стоп")) {
            System.out.println("Введите номер заказа:");
            int number = scanner.nextInt();
            stop = scanner.nextLine();
            for (int i = 0; i < orderList.size(); i++) {
                if (orderList.get(i).orderNumber == number) {
                    orderList.get(i).statusChange(i,scanner,orderList,orderList.get(i));
                    orderList.get(i).orderUpgradeTime = LocalDateTime.now();
                    newOrder = false;
                }

            }
            if (newOrder) {
                Order order = new Order(number);
                order.orderTime = LocalDateTime.now();
                order.status = OrderStatus.NEW;
                orderList.add(order);
                System.out.println("Заказ готов");
                newOrder = true;
            }


        }


    }


}
