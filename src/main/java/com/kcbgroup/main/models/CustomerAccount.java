package com.kcbgroup.main.models;

import javax.persistence.*;



    @Entity
    @Table(name="ken20676_customeraccount")
    public class CustomerAccount {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer customerAccountId;

        //private Double accountBalance;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn (name="idNumber", referencedColumnName ="idNumber")
       /* @JoinColumn(name="account_type",referencedColumnName="account_type")*/

        private Account account;

        public CustomerAccount() {
        }

        public CustomerAccount(Integer customerAccountId, Account account) {
            this.customerAccountId = customerAccountId;
            this.account = account;
        }

        public Integer getCustomerAccountId() {
            return customerAccountId;
        }

        public void setCustomerAccountId(Integer customerAccountId) {
            this.customerAccountId = customerAccountId;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }
    }
