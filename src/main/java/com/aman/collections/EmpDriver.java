package com.aman.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");

        Emp emp1 = (Emp) context.getBean("emp1");

        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getPhones());
    }
}
