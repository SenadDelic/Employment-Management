package com.management.service;

import com.management.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void save(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
