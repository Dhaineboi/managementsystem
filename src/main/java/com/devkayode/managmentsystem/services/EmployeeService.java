package com.devkayode.managmentsystem.services;

import com.devkayode.managmentsystem.dtos.EmployeeDTO;
import com.devkayode.managmentsystem.dtos.Response;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */


public interface EmployeeService {

    Response createEmployee(EmployeeDTO employee);
    Response updateEmployee(Long id, EmployeeDTO employee);
    Response findEmployee(Long id);
    Response getAllEmployees();
    Response deleteEmployee(Long id);

}
