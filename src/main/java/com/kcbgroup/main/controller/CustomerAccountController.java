package com.kcbgroup.main.controller;

import com.kcbgroup.main.models.CustomerAccount;
import com.kcbgroup.main.service.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
public class CustomerAccountController {

    @Autowired
    CustomerAccountService customerAccountService;

    @PostMapping("/create")
    public CustomerAccount createCustomerAccount(@RequestBody CustomerAccount customerAccount){
        return customerAccountService.save(customerAccount);
    }

    @GetMapping("/view")
    public List<CustomerAccount> findAll(){
        return customerAccountService.findAll();
    }


    @GetMapping("/getAccount{idNumber}")
    public Optional<CustomerAccount> getAccountByIdNumber(Integer idNumber) {
        return customerAccountService.getById(idNumber);

    }

   /* @GetMapping("/getAccountDetails")
    public Optional<CustomerAccount> getAccountByIdNumber(Integer idNumber) {
        return customerAccountService.getById(idNumber);

    }*/
}
