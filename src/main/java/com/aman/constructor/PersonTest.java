package com.aman.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("constructorConfig.xml");

        Person person1 =(Person) context.getBean("person1");

        System.out.println(person1);
    }
}
