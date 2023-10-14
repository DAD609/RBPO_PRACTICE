package ru.company.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.company.app.model.entity.Employee;
import ru.company.app.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> showAll() {
        return employeeService.getAll();
    }

    @PostMapping
    public ResponseEntity<Void> create(Employee employee) {
        employeeService.add(employee);
        return ResponseEntity.ok().build();
    }
}
