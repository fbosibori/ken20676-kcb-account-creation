package com.kcbgroup.main.controller;

import com.kcbgroup.main.models.Account;
import com.kcbgroup.main.models.Customer;
import com.kcbgroup.main.repository.AccountRepository;
import com.kcbgroup.main.repository.CustomerRepository;
import com.kcbgroup.main.service.AccountService;
import com.kcbgroup.main.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
public class AccountController {

    private final AccountService accountService;
    private final CustomerService customerService;
    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public AccountController(AccountService accountService, CustomerService customerService, AccountRepository accountRepository, CustomerRepository customeRepository, CustomerRepository customerRepository) {
        this.accountService = accountService;
        this.customerService = customerService;
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;

    }

    @GetMapping
    public List<Account> getAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }
    @PostMapping("/post/account/{id}")
    public ResponseEntity<?> postAccount(@RequestBody Account account, @PathVariable long id) {

        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
            account.setCustomer(customer);
            Account newAccount = accountRepository.save(account);
        } else {
            System.out.println("Not found");
        }

        return new ResponseEntity<>("Account created", HttpStatus.OK);
    }

}




