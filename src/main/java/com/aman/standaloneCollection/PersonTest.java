package com.aman.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneConfig.xml");

        Person person1 = context.getBean("person1",Person.class);

        System.out.println(person1.getFriends());
        System.out.println(person1.getFriends().getClass().getName());
    }
}
