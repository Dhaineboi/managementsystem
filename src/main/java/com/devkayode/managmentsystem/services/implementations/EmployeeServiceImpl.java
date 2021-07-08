package com.devkayode.managmentsystem.services.implementations;


import com.devkayode.managmentsystem.dtos.EmployeeDTO;
import com.devkayode.managmentsystem.dtos.Response;
import com.devkayode.managmentsystem.models.Employee;
import com.devkayode.managmentsystem.repositories.EmployeeRepo;
import com.devkayode.managmentsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public Response createEmployee(EmployeeDTO employee) {
        Employee employee1 = Employee.builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .address(employee.getAddress())
                .phoneNumber(employee.getPhoneNumber())
                .role(employee.getRole())
                .department(employee.getDepartment())
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        employeeRepo.save(employee1);
        return prepareResponse("00","Employee Created Successfully", true);
    }

    @Override
    public Response updateEmployee(Long id,EmployeeDTO employee) {

        Employee employee1 = employeeRepo.getById(id);
        if (employee1 == null){
            return prepareResponse("99","Employee Not Found", false);
        }

        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setAddress(employee.getAddress());
        employee1.setPhoneNumber(employee.getPhoneNumber());
        employee1.setRole(employee.getRole());
        employee1.setDepartment(employee.getDepartment());
        employee1.setUpdatedDate(LocalDateTime.now());

        employeeRepo.save(employee1);
        return prepareResponse("00","Employee Updated Successfully", true);
    }

    @Override
    public Response findEmployee(Long id) {
        Employee employee = employeeRepo.getById(id);
        if (employee == null){
            return prepareResponse("99","Employee Not Found", false);
        }
        return prepareResponse("00", "Employee Found",employee);
    }

    @Override
    public Response getAllEmployees() {
        return prepareResponse("00", "List Of Employees Found",employeeRepo.findAll());
    }

    @Override
    public Response deleteEmployee(Long id) {
        return null;
    }

    private Response prepareResponse(String code, String message, Object result){
        return Response.builder()
                .code(code)
                .message(message)
                .result(result)
                .build();
    }
}
