package com.aman.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusTest {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleConfig.xml");

        Bus bus1 = (Bus) context.getBean("bus1");

        System.out.println(bus1.getPrice());

        context.registerShutdownHook();
    }
}
