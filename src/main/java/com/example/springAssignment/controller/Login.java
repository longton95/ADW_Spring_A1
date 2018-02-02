package com.example.springAssignment.controller;

import com.example.springAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Login {
    @Autowired
    private UserService userService;

    private static final String LOGIN = "login";


    @GetMapping(value = "/login")
    public String login (Model model) {


        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        model.addAttribute("username", name);

        return LOGIN;

    }

    @GetMapping("/login-error")
    public String loginError(Model model) {

        model.addAttribute("loginError", true);

        return LOGIN;
    }
}