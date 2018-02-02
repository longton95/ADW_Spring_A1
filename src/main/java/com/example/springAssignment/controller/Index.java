package com.example.springAssignment.controller;


import com.example.springAssignment.domain.User;
import com.example.springAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
public class Index {
    @Autowired
    private UserService userService;

    private static final String HOME = "index";
    private static final String HOME_PAGE_REDIRECT = "redirect:/";



    @GetMapping (value = "/")
    public String displayHome (Model model) {

        model.addAttribute ("entries", this.userService.findAllEntries ());

        return HOME;

    }

}
