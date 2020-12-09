package com.management.service;

import com.management.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee save(Employee employee);
}
