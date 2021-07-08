package com.devkayode.managmentsystem.services.implementations;


import com.devkayode.managmentsystem.dtos.EmployeeDTO;
import com.devkayode.managmentsystem.dtos.Response;
import com.devkayode.managmentsystem.services.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */


@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public Response createEmployee(EmployeeDTO employee) {
        return null;
    }

    @Override
    public Response updateEmployee(EmployeeDTO employee) {
        return null;
    }

    @Override
    public Response findEmployee(Long id) {
        return null;
    }

    @Override
    public Response getAllEmployees() {
        return null;
    }

    @Override
    public Response deleteEmployee(Long id) {
        return null;
    }
}
