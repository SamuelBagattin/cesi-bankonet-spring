package com.cesi.bankonet.models;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CurrentAccount {
    @javax.persistence.Id
    public Long number;

    public String name;

    public double balance;

    public double authorizedOverdraft;

    @OneToOne(mappedBy = "currentAccountId")
    public Customer customer;

    public Long customerId;

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
