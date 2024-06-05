package com.aman.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbcConfig.xml");

        GuestDao guestDao = context.getBean("guestDao", GuestDao.class);

        //inserting into database
//        int result = guestDao.insert(new Guest(16,"Sachin","9005502599"));
//
//        System.out.println("No of guest added:"+result);

        //updating
//        Guest g1  = new Guest(16,"Sachin","123");
//
//        int result = guestDao.change(g1);

        //delete from database

//        int result = guestDao.delete(16);
//
//        System.out.println("No of record deleted:"+result);

        //select

        //System.out.println(guestDao.getGuest(15));

        List<Guest> guestList = guestDao.getAllGuest();

        guestList.forEach(System.out::println);
    }
}
