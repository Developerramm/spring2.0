package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = null;
        employee = (Employee) context.getBean("emp");
        System.out.println(employee);

        System.out.println(context);
    }
}