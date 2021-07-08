package com.devkayode.managmentsystem.models;


import lombok.*;


import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;

    @Column(name = "first_name", updatable = false, nullable = false)
    private String firstName;

    @Column(name = "last_name", updatable = false, nullable = false)
    private String lastName;

    @Column(name = "address", updatable = false, nullable = false)
    private String address;

    @Column(name = "phone_number", updatable = false, nullable = false)
    private String phoneNumber;

    @Column(name = "department", updatable = false, nullable = false)
    private String department;

    @Column(name = "role", updatable = false, nullable = false)
    private String role;

    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "updated_date", nullable = false, updatable = false)
    private LocalDateTime updatedDate;
}
