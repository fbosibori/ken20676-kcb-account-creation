package com.kcbgroup.main.controller;

import com.kcbgroup.main.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/customer")
public class AccountController {

    private final AccountService accountService;

@Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    /*@GetMapping
    public List<Account> getAccounts() {
        List<Account> accounts = accountRepo.findAll();
        return accounts;
    }*/
}


