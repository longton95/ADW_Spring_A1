package com.example.springAssignment.controller;

import com.example.springAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Add {
    @Autowired
    private UserService userService;

    private static final String ADD = "add";




    @GetMapping(value = "/add")
    public String setUser (Model model) {

        model.addAttribute ("entries", this.userService.findAllEntries ());

        return ADD;

    }
}
