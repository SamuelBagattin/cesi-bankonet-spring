package com.cesi.bankonet.models;

import javax.persistence.Entity;

@Entity
public class SavingsAccount {
    @javax.persistence.Id
    private String number;

    String name;

    double balance;

    double interestsRate;
}
