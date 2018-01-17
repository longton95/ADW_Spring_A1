package com.example.springAssignment.controller;

import com.example.springAssignment.service.UserService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Add {
    @Autowired
    private UserService userService;

    private static final String ADD = "user/add";
    private static final String INDEX = "user/index";





    @GetMapping(value = "profile/add")
    public String setUser (Model model) {

        model.addAttribute ("entries", this.userService.findAllEntries ());
        model.addAttribute ("newEntry", new User());

        return ADD;

    }
    @PostMapping(value = "/")
    public String addComment (Model model,
                              @Valid @ModelAttribute("entries") UserService newData, BindingResult bindingResult) {

        if (bindingResult.hasErrors ()) {
            model.addAttribute ("entries", this.userService.findAllEntries ());

            return ADD;
        }
        else {
            this.userService.save(newData);

            return INDEX;
        }
    }
}
