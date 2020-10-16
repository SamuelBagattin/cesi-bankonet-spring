package com.cesi.bankonet.repositories;

import com.cesi.bankonet.models.Customer;
import org.springframework.data.repository.CrudRepository;



public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
