package com.homework.homework18;

public class Employee implements Comparable<Employee> {
    public String name;
    public String lastName;
    public Integer salary;
    public EmployeeType type;

public Employee(String name, String lastName, int salary, EmployeeType type){
    this.lastName = lastName;
    this.type = type;
    this.name = name;
    this.salary = salary;
}


    @Override
    public int compareTo(Employee o) {
        return salary.compareTo(o.salary);
    }
}
