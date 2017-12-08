package com.example.springAssignment.service;

import com.example.springAssignment.domain.Address;
import com.example.springAssignment.domain.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> findAllEntries () {
        return this.addressRepository.findAll ();
    }
}
