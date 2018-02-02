package com.example.springAssignment.controller;

import com.example.springAssignment.service.UserService;
import com.example.springAssignment.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Add {
    @Autowired
    private UserService userService;

    private static final String ADD = "user/add";
    private static final String INDEX = "index";


    @GetMapping(value = "profile/add")
    public String getUser (Model model) {

//        model.addAttribute ("entries", this.userService.findAllEntries ());
        model.addAttribute ("newData", new User());

        return ADD;

    }

    @PostMapping (value = "profile/add")
    public String update (Model model,
//                               @PathVariable String email,
                               @Valid @ModelAttribute ("newData") User newData,

                             BindingResult bindingResult) {


        if (bindingResult.hasErrors ()) {
            System.out.println("supppppp");
            System.out.println(bindingResult.getAllErrors());

            model.addAttribute ("entries", this.userService.findAllEntries ());

            return ADD;
        }
        else {

            User current = this.userService.findUserByEmail ("john@gmail.com");

            current.setBitcoin (newData.getBitcoin ());
            current.setEtherium (newData.getEtherium ());
            current.setLitecoin (newData.getLitecoin ());

            this.userService.save (current);

            return "redirect:/";
        }
    }
//
}
