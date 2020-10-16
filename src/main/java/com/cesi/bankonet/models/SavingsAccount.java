package com.cesi.bankonet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavingsAccount {
    @Id
    public Long number;

    public String name;

    public double balance;

    public double interestsRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Long number, String name, double balance, double interestsRate) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.interestsRate = interestsRate;
    }

    public SavingsAccount(Long number) {
        this.number = number;
    }


}
