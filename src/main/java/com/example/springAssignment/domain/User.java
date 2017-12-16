package com.example.springAssignment.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;


public class User {

    @Id
    private String id;

    @NotEmpty
    public String firstName;

    @NotEmpty
    public String lastName;

    @NotEmpty
    public String email;

    public Integer bitcoin;

    public Integer etherium;

    public Integer litecoin;

    public User() {
    }

    public User(String firstName, String lastName, Integer bitcoin, Integer etherium, Integer litecoin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bitcoin = bitcoin;
        this.etherium = etherium;
        this.litecoin = litecoin;
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
                "User[id=%s, firstName='%s', lastName='%s', bitcoin='%s', etherium='%s', litecoin='%s']",
                id, firstName, lastName, bitcoin, etherium, litecoin);
    }

}