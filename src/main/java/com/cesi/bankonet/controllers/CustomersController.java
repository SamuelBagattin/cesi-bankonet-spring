package com.cesi.bankonet.controllers;

import com.cesi.bankonet.models.Customer;
import com.cesi.bankonet.repositories.CustomersRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    private final CustomersRepository customersRepository;

    public CustomersController(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @GetMapping
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        return customersRepository.findAll();
    }

    @PostMapping
    public @ResponseBody
    Customer create(@RequestBody Customer customer) {
        return customersRepository.save(customer);
    }

    @PutMapping("/{id}")
    public @ResponseBody
    Customer update(@RequestBody Customer customer) {
        return customersRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    void delete(@PathVariable("id") Long id) {
        customersRepository.delete(new Customer(id));
    }

}





