package com.example.springAssignment.controller;

import com.example.springAssignment.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Register {
    private static final String REGISTER = "register";


    @GetMapping(value = "/register")
    public String register (Model model) {

        model.addAttribute ("user", new User());

        return REGISTER;

    }

    @GetMapping("/register-error")
    public String registerError(Model model) {

        model.addAttribute("registerError", true);

        return REGISTER;
    }
}
