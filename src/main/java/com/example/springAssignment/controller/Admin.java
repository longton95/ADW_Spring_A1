package com.example.springAssignment.controller;

import com.example.springAssignment.domain.User;
import com.example.springAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class Admin {
    @Autowired
    public UserService userService;

    private static final String ADMIN = "admin/admin";
    private static final String EDIT_USER = "admin/editUser";
    private static final String ADMIN_REDIRECT = "redirect:/";




    @GetMapping(value = "/admin")
    public String setUser (Model model) {

        model.addAttribute ("entries", this.userService.findAllEntries ());
        model.addAttribute ("newData", new User ());

        return ADMIN;

    }

    @PostMapping(value = "/admin")
    public String makeUser (Model model,
                              @Valid @ModelAttribute("newData") User newData,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors ()) {
            model.addAttribute ("entries", this.userService.findAllEntries ());

            return ADMIN;
        }
        else {
            this.userService.save(newData);

            return ADMIN_REDIRECT;
        }
    }

    @GetMapping (value = "/admin/delete/{id}")
    public String deleteUser (@PathVariable String id) {

        this.userService.delete (id);

        return ADMIN_REDIRECT;
    }


    @GetMapping (value = "/admin/edit/{id}")
    public String getEditUser (Model model, @PathVariable String id) {

        model.addAttribute ("entries", this.userService.findAllEntries ());
        model.addAttribute ("userData", this.userService.findUserById (id));

        return EDIT_USER;
    }


    @PostMapping (value = "/admin/edit/")
    public String postEditUser (Model model,
                          @Valid @ModelAttribute ("userData") User newData,
                          BindingResult bindingResult) {


        if (bindingResult.hasErrors ()) {

            model.addAttribute ("entries", this.userService.findAllEntries ());

            return EDIT_USER;
        }
        else {


            User current = this.userService.findUserById (newData.getId());


            current.setId (newData.getId());
            current.setFirstName (newData.getFirstName ());
            current.setLastName (newData.getLastName ());
            current.setRole (newData.getRole ());
            current.setEmail (newData.getEmail ());
            current.setBitcoin (newData.getBitcoin ());
            current.setEtherium (newData.getEtherium ());
            current.setLitecoin (newData.getLitecoin ());

            this.userService.save (current);

            return ADMIN_REDIRECT;
        }
    }


}
