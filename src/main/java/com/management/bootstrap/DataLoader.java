package com.management.bootstrap;

import com.management.model.Employee;
import com.management.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final EmployeeService employeeService;

    public DataLoader(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) {
        if (employeeService.getAllEmployees().size() == 0)
            loadData();
    }

    private void loadData() {
        Employee mujo = new Employee();
        mujo.setFirstName("Mujaga");
        mujo.setLastName("Mujagic");
        mujo.setEmail("mujo.mujagic@someEmail");
        Employee saveMujo = employeeService.save(mujo);

        Employee haso = new Employee();
        mujo.setFirstName("Haso");
        mujo.setLastName("Husic");
        mujo.setEmail("haso.husic@someEmail");
        Employee saveHaso = employeeService.save(haso);

        Employee husnija = new Employee();
        mujo.setFirstName("Husnija");
        mujo.setLastName("Haman");
        mujo.setEmail("husnija.haman@someEmail");
        Employee saveHusnija = employeeService.save(husnija);

    }
}
