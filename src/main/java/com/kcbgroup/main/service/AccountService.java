package com.kcbgroup.main.service;

import com.kcbgroup.main.models.Account;
import com.kcbgroup.main.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    public AccountService(AccountRepository accountRepository, CustomerService customerService) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;
    }
    public void saveAccount(Account account){
        accountRepository.save(account);}

    public Optional<Account> findById(Long idNumber) {return accountRepository.findById(idNumber); }

    public List<Account> findAll(){
        return  accountRepository.findAll();
    }
    }

  




