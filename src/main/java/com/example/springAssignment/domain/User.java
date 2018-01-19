package com.example.springAssignment.domain;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "advancedWeb")
public class User {

    @Id
    public String id;

    @NotEmpty
    public String firstName;

    @NotEmpty
    public String lastName;

    @NotEmpty
    public String email;

    public String role;

    public Integer bitcoin;

    public Integer etherium;

    public Integer litecoin;

    public User() {
    }

    public User (Integer bitcoin, Integer etherium, Integer litecoin) {
        this.bitcoin = bitcoin;
        this.etherium = etherium;
        this.litecoin = litecoin;
    }

    public User(String id,String firstName, String lastName, String role, String email, Integer bitcoin, Integer etherium, Integer litecoin) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.bitcoin = bitcoin;
        this.etherium = etherium;
        this.litecoin = litecoin;
    }

    public String getId () {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRole () {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
            return email;
        }

    public void setEmail(String email) { this.email = email; }

    public Integer getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(Integer bitcoin) { this.bitcoin = bitcoin; }

    public Integer getEtherium() {
        return etherium;
    }

    public void setEtherium(Integer etherium) { this.etherium = etherium; }

    public Integer getLitecoin() {
        return litecoin;
    }

    public void setLitecoin(Integer litecoin) { this.litecoin = litecoin; }



    @Override
    public String toString() {
        return String.format(
                "User[id=%s, firstName='%s', lastName='%s', email='%s', bitcoin='%s', etherium='%s', litecoin='%s']",
                id, firstName, lastName, email, bitcoin, etherium, litecoin);
    }

}