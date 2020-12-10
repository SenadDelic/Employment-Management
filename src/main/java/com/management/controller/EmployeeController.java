package com.management.controller;

import com.management.model.Employee;
import com.management.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        listEmployeesTest();

        return "index";
    }

    private void listEmployeesTest() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }
}
