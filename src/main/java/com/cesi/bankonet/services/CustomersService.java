package com.cesi.bankonet.services;

import com.cesi.bankonet.models.Customer;
import com.cesi.bankonet.repositories.CustomersRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class CustomersService {

    private final CustomersRepository customersRepository;


    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Iterable<Customer> getAllUsers() {
        return customersRepository.findAll();
    }

    public Customer create(@RequestBody Customer customer) {
        return customersRepository.save(customer);
    }

    public static Boolean IsNameAString(String str) {
        String regex = "^[a-zA-Z]+$";
        return str.matches(regex);
    }

    public static Boolean HasStringRightLength(int length, String str) {
        int legnth;
        return str.length() <= length;
    }

}
