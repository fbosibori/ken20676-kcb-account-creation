package com.kcbgroup.main.controller;

import com.kcbgroup.main.models.Customer;
import com.kcbgroup.main.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RequestMapping()
@RestController
public class CustomerController {

    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;



    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer)
    {

        return customerService.saveCustomer(customer);
    }


    @GetMapping("/customer/{iD}")
    public Optional<Customer> findBy(@PathVariable Long iD){

        return customerService.findById(iD);
    }


    @GetMapping("customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }


    @PutMapping(path = "{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id){
        logger.debug("Request to update customer : {}, with id : {}", customer, id);

        // get by id

        return customerService.saveCustomer(customer);
    }
}
