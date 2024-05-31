package com.aman.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");

        Car car1 = (Car) context.getBean("car1");

        System.out.println(car1.getPrice());

        context.registerShutdownHook();
    }
}
