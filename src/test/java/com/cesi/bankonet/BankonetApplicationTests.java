package com.cesi.bankonet;

import com.cesi.bankonet.models.Account;
import com.cesi.bankonet.models.CurrentAccount;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class BankonetApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertTrue(true);
    }

    @Test
    public void testerToString()
    {
        CurrentAccount compte1 = new CurrentAccount(123456L, "Dupont", 0.0d, -500.0d);
        assertEquals("CurrentAccount{number='123456', name='Dupont', balance='0.0', authorizedOverDraft='-500.0'}", compte1.toString());
    }


}
