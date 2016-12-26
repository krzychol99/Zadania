package com.company.app;

import com.company.model.Employee;

public class HumanResources {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Marian", "Krzak");
        Employee employee3 = new Employee("Zenek", "Martyniuk");

        System.out.println("Employees list: ");
        System.out.println("[1] FIRST NAME: " + employee1.getFirstName() + "; LAST NAME: " + employee1.getLastName());
        System.out.println("[2] FIRST NAME: " + employee2.getFirstName() + "; LAST NAME: " + employee2.getLastName());
        System.out.println("[3] FIRST NAME: " + employee3.getFirstName() + "; LAST NAME: " + employee3.getLastName());
    }
}
