package com.devkayode.managmentsystem.repositories;

import com.devkayode.managmentsystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
