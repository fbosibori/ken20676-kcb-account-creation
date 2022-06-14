package com.kcbgroup.main.service;

import com.kcbgroup.main.models.CustomerAccount;
import com.kcbgroup.main.repository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerAccountService {

    @Autowired
    CustomerAccountRepository customerAccountRepository;

    public CustomerAccountService(CustomerAccountRepository customerAccountRepository) {
        this.customerAccountRepository = customerAccountRepository;

    }
public CustomerAccount save(CustomerAccount customerAccount){
        return customerAccountRepository.save(customerAccount);
}

public List<CustomerAccount> findAll(){
        return customerAccountRepository.findAll();
    }

    public Optional<CustomerAccount> getById(Integer accountNumber) {
        return customerAccountRepository.findById(accountNumber);
    }
}
