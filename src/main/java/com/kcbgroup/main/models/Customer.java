package com.kcbgroup.main.models;

import javax.persistence.*;

@Entity
@Table(name = "KEN20676_Customer")
public class Customer {
    @Id
    private Long iD;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
private String email;

    @Column(name = "phone_number")
    private long phoneNumber;

    private String maritalStatus;

    public Customer() {
    }

    public Customer(Long iD, String firstName, String lastName, String email, long phoneNumber) {
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return iD;
    }

    public void setId(Long iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

