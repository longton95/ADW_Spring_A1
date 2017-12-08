package com.example.springAssignment.controller;


import com.example.springAssignment.domain.Address;
import com.example.springAssignment.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class home {
    @Autowired
    private AddressService addressService;

    private static final String HOME = "home";

    @GetMapping (value = "/")
    public String displayHome () {

        return HOME;

    }

    @GetMapping ("/address")
    public List<Address> getAllAddresses () {
        return addressService.findAllEntries ();
    }


}
