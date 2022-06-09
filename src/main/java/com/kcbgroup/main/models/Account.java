package com.kcbgroup.main.models;

import javax.persistence.*;

@Entity
@Table(name = "KEN20676_Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idNumber;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "branch_name")
    private String branchName;

    public Account() {
    }

    public Account(int id, int customerId, String accountName, String accountNumber) {
        idNumber = id;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

}
