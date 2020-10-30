package com.example.demo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
    @GetMapping("/department-main")
    public String department(Model model) {
        return "departmentMain";
    }

}
