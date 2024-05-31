package com.aman.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");

       Train train1 = (Train) context.getBean("train1");

        System.out.println("Train Name:"+train1.getName());
        System.out.println("Train Speed:"+train1.getSpeed());
        System.out.println("Driver Name:"+train1.getTd().getDriverName());
    }
}
