package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = context.getBean(Employee.class);
        Employee emp2 = context.getBean(Employee.class);
        System.out.println(employee.hashCode());
        System.out.println(emp2.hashCode());

        ((AbstractApplicationContext) context).close();

    }
}