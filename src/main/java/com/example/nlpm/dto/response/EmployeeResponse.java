package com.example.nlpm.dto.response;



public record EmployeeResponse(
        Long id,
        String firstName,
        String lastName,
        String email
) {}
