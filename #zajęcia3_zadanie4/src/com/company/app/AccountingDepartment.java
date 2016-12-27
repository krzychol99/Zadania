package com.company.app;

import com.company.model.Employee;

public class AccountingDepartment {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[1] = new Employee("Jan", "Kowalski",4550.58);
        employees[2] = new Employee("Marian", "Krzak", 5200.67);
        employees[3] = new Employee("Zenek", "Martyniuk", 65000.23);
        employees[4]  = new Employee("Gracjan", "Rostocki", 75090.56);

        System.out.println("Employees list: ");
        System.out.println("[1] FIRST NAME: " + employees[1].getFirstName() + "; LAST NAME: " + employees[1].getLastName()
                + "; SALARY: " + employees[1].getSalary() + " PLN");
        System.out.println("[2] FIRST NAME: " + employees[2].getFirstName() + "; LAST NAME: " + employees[2].getLastName()
                + "; SALARY: " + employees[2].getSalary() + " PLN");
        System.out.println("[3] FIRST NAME: " + employees[3].getFirstName() + "; LAST NAME: " + employees[3].getLastName()
                + "; SALARY: " + employees[3].getSalary() + " PLN");
        System.out.println("[4] FIRST NAME: " + employees[4].getFirstName() + "; LAST NAME: " + employees[4].getLastName()
                + "; SALARY: " + employees[4].getSalary() + " PLN");
    }

}
