package com.cesi.bankonet.services;

import com.cesi.bankonet.models.Customer;
import com.cesi.bankonet.repositories.CustomersRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

    private final CustomersRepository customersRepository;


    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public  Iterable<Customer> getAllUsers() {
        return customersRepository.findAll();
    }
}
