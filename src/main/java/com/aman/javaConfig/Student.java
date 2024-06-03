package com.aman.javaConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("Aman")
    private String name;
    private int age;

    @Autowired
    private Address add;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    public Address getAdd(){
        return add;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAdd(Address add){
        this.add = add;
    }


}
