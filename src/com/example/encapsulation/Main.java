package com.example.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmployeeName("Berlin");
        emp.setSalary(50000);

        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getSalary());
    
        // Invalid salary
        emp.setSalary(-1000); // This will trigger the validation in the setter method
    }
}
