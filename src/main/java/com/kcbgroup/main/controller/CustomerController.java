package com.kcbgroup.main.controller;

import com.kcbgroup.main.models.Customer;
import com.kcbgroup.main.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping()
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;

    }

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return customerService.save(customer);
    }


    @GetMapping("/customer/{iD}")
    public Optional<Customer> findBy(@PathVariable Long iD){
        return customerService.findById(iD);
    }


    @GetMapping("customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
