package com.aman.javaConfig;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {

    @Bean("student")
    public Student getStudent(){
        return new Student();
    }

    @Bean("address")
    public Address getAddress(){
        return new Address();
    }

}
