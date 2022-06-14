package com.kcbgroup.main.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "KEN20676_Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNumber;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "account_type")
    private String accountType;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "customer_id",referencedColumnName="id")
    @JsonIgnore
    private Customer customer;

    public Account() {
    }

    public Account(Long idNumber, String accountName, String accountNumber, String branchName, Customer cust) {
        this.idNumber = idNumber;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
        this.accountType = accountType;
        this.customer = customer;
    }

    public Long getIdNumber() {return idNumber;}

    public void setIdNumber(Long idNumber) {this.idNumber = idNumber;}

    public String getAccountName() {return accountName;}

    public void setAccountName(String accountName) {this.accountName = accountName;}

    public String getAccountNumber() {return accountNumber;}

    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}

    public String getBranchName() {return branchName;}

    public void setBranchName(String branchName) {this.branchName = branchName;}

    public String getAccountType() {return accountType;}

    public void setAccountTpye(String accountType) {this.accountType = accountType;}

    public Customer getCustomer() {return customer;}

    public void setCustomer(Customer customer) { this.customer = customer;}
}

