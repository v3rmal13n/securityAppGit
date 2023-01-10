package com.example.testFirstProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyFirstController {

    @GetMapping("/")
    public String getInfoForAllEmployees () {

        return "viewAll.html";
    }

    @GetMapping("hr_info")
    public String getInfoOnlyForHR () {

        return "viewHR.html";
    }

    @GetMapping("manager_info")
    public String getInfoOnlyManagers () {

        return "viewManagers.html";
    }
}
