package com.cesi.bankonet.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String firstName;

    public String lastName;

    @ManyToMany()
    @JoinColumn(referencedColumnName = "id")
    public List<CurrentAccount> currentAccount;

    public Customer(Long id) {
        this.id = id;
    }

    public Customer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }
}
