package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;
import com.app.beans.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = context.getBean(Employee.class);

        System.out.println(employee);

        Amazon amazon = context.getBean(Amazon.class);
        System.out.println(amazon);

        ((AbstractApplicationContext) context).close();
    }
}