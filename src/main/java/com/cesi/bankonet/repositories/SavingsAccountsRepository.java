package com.cesi.bankonet.repositories;

import com.cesi.bankonet.models.SavingsAccount;
import org.springframework.data.repository.CrudRepository;


public interface SavingsAccountsRepository extends CrudRepository<SavingsAccount, Integer> {

}
