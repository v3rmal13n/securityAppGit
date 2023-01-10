package com.example.testFirstProject.controllers;

import com.example.testFirstProject.entity.Employee;
import com.example.testFirstProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MySecondController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("allEmployees")
    public String allEmployees (Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "allEmployees.html";
    }

    @GetMapping("allSalaries")
    public String allSalaries (Model model) {
        List<Employee> allSalaries = employeeService.getAllEmployees();
        model.addAttribute("allSalaries", allSalaries);
        return "allSalaries.html";
    }
}
