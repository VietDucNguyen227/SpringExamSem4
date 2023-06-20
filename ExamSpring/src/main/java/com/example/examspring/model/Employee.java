package com.example.examspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employeeId")
    private String employeeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeWage")
    private Long employeeWage;
}
