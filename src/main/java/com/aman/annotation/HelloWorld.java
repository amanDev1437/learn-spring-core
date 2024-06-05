package com.aman.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component
public class HelloWorld {

    private String name="Aman Singh";
    private int age=23;


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
