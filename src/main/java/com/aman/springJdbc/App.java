package com.aman.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbcConfig.xml");

        GuestDao guestDao = context.getBean("guestDao", GuestDao.class);

//        int result = guestDao.insert(new Guest("Sachin","9005502599"));
//
//        System.out.println("No of guest added:"+result);
//        Guest g1  = new Guest(16,"Sachin","123");
//
//        int result = guestDao.change(g1);

        Guest g2 = new Guest();
        g2.setGuestId(18);

        int result = guestDao.delete(g2);

        System.out.println("No of record deleted:"+result);
    }
}
