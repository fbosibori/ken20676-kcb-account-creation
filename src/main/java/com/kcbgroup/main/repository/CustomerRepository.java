package com.kcbgroup.main.repository;

import com.kcbgroup.main.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
