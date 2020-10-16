package com.cesi.bankonet.controllers;
import com.cesi.bankonet.models.CurrentAccount;
import com.cesi.bankonet.models.SavingsAccount;
import com.cesi.bankonet.repositories.CurrentAccountsRepository;
import com.cesi.bankonet.repositories.SavingsAccountsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/current-accounts")
public class CurrentAccountController {

    private final CurrentAccountsRepository currentAccountsRepository;

    public CurrentAccountController(CurrentAccountsRepository currentAccountsRepository) {
        this.currentAccountsRepository = currentAccountsRepository;
    }

    @GetMapping
    public @ResponseBody
    Iterable<CurrentAccount> getAll() {
        return currentAccountsRepository.findAll();
    }

    @PostMapping
    public @ResponseBody
    CurrentAccount create(@RequestBody CurrentAccount savingsAccount) {
        return currentAccountsRepository.save(savingsAccount);
    }

    @PutMapping("/{id}")
    public @ResponseBody
    CurrentAccount update(@RequestBody CurrentAccount savingsAccount, @PathVariable String id) {
        return currentAccountsRepository.save(savingsAccount);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    void delete(@PathVariable("id") Long id) {
        currentAccountsRepository.delete(new CurrentAccount(id));
    }

}

