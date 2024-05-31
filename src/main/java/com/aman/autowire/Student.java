package com.aman.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {

    @Autowired
    @Qualifier("address2")
    private Address address;

    public Student(){}

    public Student(Address address){
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }
}
