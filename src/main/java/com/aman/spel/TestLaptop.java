package com.aman.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLaptop {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spelConfig.xml");

        Laptop laptop = context.getBean("laptop", Laptop.class);

        System.out.println(laptop.getVersions());
    }
}
