package com.example.nlpm.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class EmployeeDTO {

    private static final Logger log = LoggerFactory.getLogger(EmployeeDTO.class);
    private Long id;

    String name;

    String email;

    Integer age;

    LocalDate dateOfJoining;

    private boolean isActive;

    public EmployeeDTO(String johnDoe, String mail, Integer integer, LocalDate now, boolean b) {
    }

    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate dateOfJoining, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
