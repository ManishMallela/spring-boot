package com.example.nlpm.service.impl;

import com.example.nlpm.dto.request.EmployeeRequest;
import com.example.nlpm.dto.response.EmployeeResponse;
import com.example.nlpm.entity.Employee;
import com.example.nlpm.utility.mapper.EmployeeMapper;
import com.example.nlpm.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(
            EmployeeRepository employeeRepository,
            EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public EmployeeResponse saveEmployee(EmployeeRequest request) {

        Employee employee = employeeMapper.toEntity(request);

        Employee savedEmployee = employeeRepository.save(employee);

        return employeeMapper.toResponse(savedEmployee);
    }

    @Transactional(readOnly = true)
    public List<EmployeeResponse> getAllEmployees() {

        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper::toResponse)
                .toList();
    }

    @Transactional(readOnly = true)
    public EmployeeResponse getEmployeeById(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found: " + id));

        return employeeMapper.toResponse(employee);
    }
}