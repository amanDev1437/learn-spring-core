package com.aman.javaConfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String state;
    private String city;

    public String getState(){
        return state;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setCity(String city){
        this.city = city;
    }
}
