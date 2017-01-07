package com.company.app;

import com.company.model.Employee;

public class AccountingDepartment {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jan", "Kowalski",4550.58);
        Employee employee2 = new Employee("Marian", "Krzak", 5200.67);
        Employee employee3 = new Employee("Zenek", "Martyniuk", 65000.23);
        Employee employee4 = new Employee("Gracjan", "Rostocki", 75090.56);

        System.out.println("Employees list: ");
        System.out.println("[1] FIRST NAME: " + employee1.getFirstName() + "; LAST NAME: " + employee1.getLastName()
                + "; SALARY: " + employee1.getSalary() + " PLN");
        System.out.println("[2] FIRST NAME: " + employee2.getFirstName() + "; LAST NAME: " + employee2.getLastName()
                + "; SALARY: " + employee2.getSalary() + " PLN");
        System.out.println("[3] FIRST NAME: " + employee3.getFirstName() + "; LAST NAME: " + employee3.getLastName()
                + "; SALARY: " + employee3.getSalary() + " PLN");
        System.out.println("[4] FIRST NAME: " + employee4.getFirstName() + "; LAST NAME: " + employee4.getLastName()
                + "; SALARY: " + employee4.getSalary() + " PLN");
    }

}
