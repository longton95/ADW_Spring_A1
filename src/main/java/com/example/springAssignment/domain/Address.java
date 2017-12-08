package com.example.springAssignment.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;


public class Address {

    @Id
    private String id;

    @NotEmpty
    public String firstName;

    @NotEmpty
    public String lastName;

    @NotEmpty
    private String email;

    @NotEmpty
    private String houseNumber;

    @NotEmpty
    private String postCode;

    public Address() {}

    public Address(String firstName, String lastName,String houseNumber, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}

