package com.kcbgroup.main.service;

import com.kcbgroup.main.models.Account;
import com.kcbgroup.main.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getaccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }

  
    }



