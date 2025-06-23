package com.example.employeeservice;

import com.example.employeeservice.EmployeeController;
import com.example.employeeservice.EmployeeManager;
import com.example.employeeservice.Employee;
import com.example.employeeservice.Employees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllEmployees() {
   
        Employee emp1 = new Employee("E001", "John", "Doe", "john@example.com", "Engineer");
        Employee emp2 = new Employee("E002", "Alice", "Smith", "alice@example.com", "Manager");

        List<Employee> employeeList = Arrays.asList(emp1, emp2);
        Employees employeesWrapper = new Employees(employeeList);

        when(employeeManager.getAllEmployees()).thenReturn(employeesWrapper);

   
        Employees result = employeeController.getEmployees();


        assertEquals(2, result.getEmployees().size());
        assertEquals("E001", result.getEmployees().get(0).getEmployee_id());
        verify(employeeManager, times(1)).getAllEmployees();
    }

    @Test
    void testAddEmployee() {

        Employee emp = new Employee("E003", "Bob", "Brown", "bob@example.com", "Developer");

        when(employeeManager.addEmployee(emp)).thenReturn(emp);


        Employee result = employeeController.addEmployee(emp);


        assertNotNull(result);
        assertEquals("Bob", result.getFirst_name());
        assertEquals("E003", result.getEmployee_id());
        verify(employeeManager, times(1)).addEmployee(emp);
    }
}
