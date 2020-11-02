package com.cesi.bankonet;

import com.cesi.bankonet.models.Customer;
import com.cesi.bankonet.repositories.CustomersRepository;
import com.cesi.bankonet.services.CustomersService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomersServicesTests {

    @Test
    public void testerIsNameAString() {
        assertEquals(true, CustomersService.IsNameAString("Eric"));
        assertEquals(false, CustomersService.IsNameAString("12"));
        assertEquals(false, CustomersService.IsNameAString(""));
     }

    @Test
    public void testerHasStringRightLength()
    {
        assertEquals(true, CustomersService.HasStringRightLength(2,"Er"));
        assertEquals(false, CustomersService.HasStringRightLength(2,"Eric"));
    }
}
