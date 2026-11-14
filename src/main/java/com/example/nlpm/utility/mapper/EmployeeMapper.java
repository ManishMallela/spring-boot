package com.example.nlpm.utility.mapper;



import com.example.nlpm.dto.request.EmployeeRequest;
import com.example.nlpm.dto.response.EmployeeResponse;
import com.example.nlpm.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(target = "id", ignore = true)
    Employee toEntity(EmployeeRequest request);

    EmployeeResponse toResponse(Employee employee);
}
