package com.xyz.openapi.server.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employees = new ArrayList<>();

    public static EmployeeList of(List<Employee> employees) {
        EmployeeList employeeList = new EmployeeList();
        employeeList.setEmployees(employees);
        return employeeList;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
