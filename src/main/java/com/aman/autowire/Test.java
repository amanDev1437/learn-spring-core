package com.aman.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student.getAddress().getCity());
        System.out.println(student.getAddress().getState());
    }
}
