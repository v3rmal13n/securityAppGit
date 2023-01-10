package com.example.testFirstProject.controllers;

import com.example.testFirstProject.entity.Employee;
import com.example.testFirstProject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

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
    @GetMapping("/addNewEmployee")
    public String addNewEmployee (Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info.html";
    }
    @GetMapping("/saveEmployee")
    public String saveEmployee (@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/allEmployees";
    }
    @GetMapping("{id}/updateInfo")
    public String updateEmployee (Model model, //для того, что бы отобразить уже ранее заполненного работника
                                  @PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info.html";
    }
    @GetMapping("{id}/deleteEmployee")
    public String deleteEmployee (Model model, @PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/allEmployees";
    }
}
