package com.example.springAssignment.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entry_id")
    private Integer id;

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

}

