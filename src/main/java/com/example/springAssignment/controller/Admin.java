package com.example.springAssignment.controller;

import com.example.springAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Admin {
    @Autowired
    private UserService userService;

    private static final String ADMIN = "admin";




    @GetMapping(value = "/admin")
    public String setUser (Model model) {

        model.addAttribute ("entries", this.userService.findAllEntries ());

        return ADMIN;

    }
}
