package com.homework.homework18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        int salary;
        String name;
        String lastName;
        EmployeeType type;
        int stop = 0;
        Scanner scanner = new Scanner(System.in);
        while (stop != 2) {
            System.out.println("Введите зарплату сотрудника: ");
            salary = scanner.nextInt();
            System.out.println("Введите имя сотрудника: ");
            name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.println("Введите фамилию сотрудника: ");
            lastName = scanner.nextLine();
            System.out.println("Введите тип сотрудника: 1-DEV 2-HR 3 -MANAGER 4-QA");
            int num = scanner.nextInt();
            switch (num) {
                case (1): {
                    type = EmployeeType.DEV;
                    break;
                }
                case (2): {
                    type = EmployeeType.HR;
                    break;
                }
                case (3): {
                    type = EmployeeType.MANAGER;
                    break;
                }
                case (4): {
                    type = EmployeeType.QA;
                    break;
                }

                default:
                    throw new IllegalStateException("Unexpected value: " + num);
            }
            Employee employee = new Employee(name, lastName, salary, type);
            employees.add(employee);
            System.out.println("Выберите действие: 1-создать сотрудника 2-вывести список");
            stop = scanner.nextInt();
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.first());
        }



    }
}
