package com.example.employeeservice;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {

    private final Employees employees = new Employees();

    public EmployeeManager() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("E001", "Alice", "Johnson", "alice.johnson@company.com", "Software Engineer"));
        list.add(new Employee("E002", "Bob", "Smith", "bob.smith@company.com", "Project Manager"));
        list.add(new Employee("E003", "Carol", "Williams", "carol.williams@company.com", "UX Designer"));
        list.add(new Employee("E004", "David", "Lee", "david.lee@company.com", "QA Engineer"));
        employees.setEmployees(list);
    }

    public Employees getAllEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
        return employee;
    }
}
