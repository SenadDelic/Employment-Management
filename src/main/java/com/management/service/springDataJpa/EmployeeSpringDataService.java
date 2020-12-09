package com.management.service.springDataJpa;

import com.management.model.Employee;
import com.management.repository.EmployeeRepository;
import com.management.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSpringDataService implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeSpringDataService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
