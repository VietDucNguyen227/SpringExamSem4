package com.example.examspring.controller;

import com.example.examspring.model.Employee;
import com.example.examspring.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/listEmployee")
    public String showEmployeeList(Model model){
        List<Employee> list = employeeService.findAllEmployee();
        model.addAttribute("list", list);
        return "listEmployee";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "newEmployee";
    }
    @PostMapping("/saveClass")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/listEmployee";
    }


}
