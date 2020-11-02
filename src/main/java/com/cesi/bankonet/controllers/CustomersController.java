package com.cesi.bankonet.controllers;

import com.cesi.bankonet.models.Customer;
import com.cesi.bankonet.repositories.CustomersRepository;
import com.cesi.bankonet.services.CustomersService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    private final CustomersService customersService;

    private final CustomersRepository customersRepository;

    public CustomersController(CustomersService customersService, CustomersRepository customersRepository) {
        this.customersService = customersService;
        this.customersRepository = customersRepository;
    }

    @GetMapping
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        return customersService.getAllUsers();
    }

    @PostMapping
    public @ResponseBody
    Customer create(@RequestBody Customer customer) {
        return customersService.create(customer);
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





