package com.example.examspring.service;


import com.example.examspring.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    void saveEmployee(Employee employee);

}
