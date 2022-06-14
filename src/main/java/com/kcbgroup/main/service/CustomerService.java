package com.kcbgroup.main.service;

import com.kcbgroup.main.models.Customer;
import com.kcbgroup.main.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer){

        return customerRepository.save(customer);
    }


    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    public List<Customer> findAll(){
        return  customerRepository.findAll();
    }

}
