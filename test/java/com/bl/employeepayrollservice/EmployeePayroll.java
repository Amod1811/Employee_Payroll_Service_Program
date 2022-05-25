package com.bl.employeepayrollservice;

public class EmployeePayroll {
    String id;
    String name;
    double salary;

    public EmployeePayroll(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayroll [Id = " + id + ", Name = " + name + ", Salary = " + salary + "";
    }
}
