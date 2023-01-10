package com.example.testFirstProject.services;

import com.example.testFirstProject.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public List<Employee> getAllEmployees();
}
