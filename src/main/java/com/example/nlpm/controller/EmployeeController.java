package com.example.nlpm.controller;

import com.example.nlpm.dto.request.EmployeeRequest;
import com.example.nlpm.dto.response.EmployeeResponse;
import com.example.nlpm.service.impl.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponse saveEmployee(
            @Valid @RequestBody EmployeeRequest request) {

        return employeeService.saveEmployee(request);
    }

    @GetMapping
    public List<EmployeeResponse> getAllEmployees() {

        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmployeeById(
            @PathVariable Long id) {

        return employeeService.getEmployeeById(id);
    }
}