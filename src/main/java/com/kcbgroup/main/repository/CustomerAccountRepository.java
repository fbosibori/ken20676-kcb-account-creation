package com.kcbgroup.main.repository;

import com.kcbgroup.main.models.Account;
import com.kcbgroup.main.models.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Integer> {




    }

