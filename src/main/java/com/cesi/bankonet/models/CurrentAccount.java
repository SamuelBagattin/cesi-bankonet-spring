package com.cesi.bankonet.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CurrentAccount {
    @javax.persistence.Id
    public Long id;

    public Long number;

    public String name;

    public double balance;

    public double authorizedOverdraft;

    @OneToOne(mappedBy = "currentAccount")
    @JsonIgnore
    public Customer customer;

    public CurrentAccount() {
    }

    public CurrentAccount(Long number) {
        this.number = number;
    }

    public CurrentAccount(Long number, String name, double balance, double authorizedOverdraft) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.authorizedOverdraft = authorizedOverdraft;
    }

}
