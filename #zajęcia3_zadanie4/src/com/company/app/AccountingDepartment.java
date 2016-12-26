package com.company.app;

import com.company.model.Employee;

public class AccountingDepartment {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jan", "Kowalski",4550);
        Employee employee2 = new Employee("Marian", "Krzak", 5200);
        Employee employee3 = new Employee("Zenek", "Martyniuk", 65000);

        System.out.println("Employees list: ");
        System.out.println("[1] FIRST NAME: " + employee1.getFirstName() + "; LAST NAME: " + employee1.getLastName()
                + "; SALARY: " + employee1.getSalary());
        System.out.println("[2] FIRST NAME: " + employee2.getFirstName() + "; LAST NAME: " + employee2.getLastName()
                + "; SALARY: " + employee2.getSalary());
        System.out.println("[3] FIRST NAME: " + employee3.getFirstName() + "; LAST NAME: " + employee3.getLastName()
                + "; SALARY: " + employee3.getSalary());
    }

}
