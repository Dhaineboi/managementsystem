package com.devkayode.managmentsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {


        private String firstName;
        private String lastName;
        private String address;
        private String phoneNumber;
        private String department;
        private String role;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;


}
