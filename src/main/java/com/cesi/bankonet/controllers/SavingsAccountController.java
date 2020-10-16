package com.cesi.bankonet.controllers;
import com.cesi.bankonet.models.SavingsAccount;
import com.cesi.bankonet.repositories.SavingsAccountsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/savings-accounts")
public class SavingsAccountController {

    private final SavingsAccountsRepository savingsAccountsRepository;

    public SavingsAccountController(SavingsAccountsRepository savingsAccountsRepository) {
        this.savingsAccountsRepository = savingsAccountsRepository;
    }

    @GetMapping
    public @ResponseBody
    Iterable<SavingsAccount> getAll() {
        return savingsAccountsRepository.findAll();
    }

    @PostMapping
    public @ResponseBody
    SavingsAccount create(@RequestBody SavingsAccount savingsAccount) {
        return savingsAccountsRepository.save(savingsAccount);
    }

    @PutMapping("/{id}")
    public @ResponseBody
    SavingsAccount update(@RequestBody SavingsAccount savingsAccount, @PathVariable String id) {
        return savingsAccountsRepository.save(savingsAccount);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    void delete(@PathVariable("id") Long id) {
        savingsAccountsRepository.delete(new SavingsAccount(id));
    }

}

