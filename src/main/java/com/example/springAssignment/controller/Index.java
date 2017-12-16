package com.example.springAssignment.controller;


import com.example.springAssignment.domain.User;
import com.example.springAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class Index {
    @Autowired
    private UserService userService;

    private static final String HOME = "index";
    private static final String FORM_ENTRIES_ID = "entries";



    @GetMapping (value = "/")
    public String displayHome (Model model) {

        model.addAttribute (FORM_ENTRIES_ID, this.userService.findAllEntries ());

        return HOME;

    }

    @GetMapping ("/address")
    public List<User> getAllAddresses () {
        return userService.findAllEntries ();
    }


}
