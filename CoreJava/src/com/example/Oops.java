package com.example;
//this will cover inheritance and polymorphism
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double calculateBonus() {
        return salary * 0.10;  // 10% bonus
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + bonus;  // Extra bonus for managers
    }
}

public class Oops {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        emp.work();
        System.out.println("Employee bonus: " + emp.calculateBonus());

        Manager mgr = new Manager("Bob", 80000, 5000);
        mgr.work();
        System.out.println("Manager bonus: " + mgr.calculateBonus());
    }
}
