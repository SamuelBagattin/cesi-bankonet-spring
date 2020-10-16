package com.cesi.bankonet.models;

import javax.persistence.Entity;

@Entity
public class CurrentAccount {
    @javax.persistence.Id
    private Long number;

    String name;

    double balance;

    double authorizedOverdraft;
}
