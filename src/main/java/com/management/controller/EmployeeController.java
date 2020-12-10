package com.management.controller;

import com.management.model.Employee;
import com.management.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

        return "index";
    }

    @GetMapping("/addEmployee")
    public String addEmployee(Model model) {
        // create form for employee(this way we have employee firstName,LastName and email)..
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "addNewEmployee";
    }

    @GetMapping("/updateEmployee")
    public String updateEmployee() {

        return "something";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);

        return "redirect:/"; // redirect to homePage(indexPage, Ok)
    }

    private void listEmployeesTest() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }
}
