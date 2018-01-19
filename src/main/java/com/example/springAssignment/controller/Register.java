package com.example.springAssignment.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Register {
    private static final String REGISTER = "register";


    @GetMapping(value = "/register")
    public String register () {

        return REGISTER;

    }

    @GetMapping("/register-error")
    public String registerError(Model model) {

        model.addAttribute("registerError", true);

        return REGISTER;
    }
}
