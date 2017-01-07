package com.company.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String position;

    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public Employee(){}

    public Employee (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Employee(String firstName, String lastName, double salary){
        this(firstName, lastName);
        this.salary = salary;
    }
}

