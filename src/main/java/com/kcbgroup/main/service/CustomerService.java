package com.kcbgroup.main.service;

import com.kcbgroup.main.models.Customer;
import com.kcbgroup.main.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer){
         return customerRepository.save(customer);
    }


    public Optional<Customer> findById(Long iD){
        return customerRepository.findById(iD);
    }

    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }

}
