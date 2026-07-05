package com.example.encapsulation;

public class Employee {
    // Private variables (hidden from outside)
    private String employeeName;
    private double salary;

    // Setter methods
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    // Getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }
}