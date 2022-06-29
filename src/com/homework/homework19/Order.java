package com.homework.homework19;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Order  {
  public OrderStatus status;
  public int orderNumber;
  public LocalDateTime orderTime;
  public LocalDateTime orderUpgradeTime;

  public Order(int orderNumber)
  {
      this.orderNumber = orderNumber;
  }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public LocalDateTime getOrderUpgradeTime() {
        return orderUpgradeTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void statusChange(int number, Scanner scanner, ArrayList orderList, Order order) throws WrongStatusException {
        System.out.println("Текущий статус заказа " + order.status );
        System.out.println("На какой статус вы хотите поменять: 1-NEW, 2-FINISHED, 3- FAILED, 4- IN_PROGRESS");
        number = scanner.nextInt();
        switch (number) {
            case (1): {
                if (order.status == OrderStatus.FINISHED || order.status == OrderStatus.IN_PROGRESS) {
                    throw new WrongStatusException("WrongStatusException");
                } else {
                    order.status = OrderStatus.NEW;
                    System.out.println("Статус успешно изменен");
                }
                break;
            }
            case (2): {
                if (order.status == OrderStatus.FAILED) {
                    throw new WrongStatusException("WrongStatusException");
                } else {
                    order.status = OrderStatus.FINISHED;
                    System.out.println("Статус успешно изменен");

                }
                break;
            }
            case (3): {

                order.status = OrderStatus.FAILED;
                System.out.println("Статус успешно изменен");
                break;
            }
            case (4): {
                if (order.status == OrderStatus.FINISHED) {
                    throw new WrongStatusException("WrongStatusException");
                } else {
                    order.status = OrderStatus.FINISHED;
                    System.out.println("Статус успешно изменен");
                }
                break;
            }
        }
    }
}
