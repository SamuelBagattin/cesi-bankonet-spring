package com.cesi.bankonet.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class CurrentAccount {
    @javax.persistence.Id
    public Long id;

    public Long number;

    public String name;

    public double balance;

    public double authorizedOverdraft;

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

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", balance='" + balance + '\'' +
                ", authorizedOverDraft='" + authorizedOverdraft + '\'' +
                '}';
    }
}
