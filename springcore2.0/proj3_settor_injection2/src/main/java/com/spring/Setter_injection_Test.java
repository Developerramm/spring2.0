package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class Setter_injection_Test {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = (Employee)context.getBean("emp");
        System.out.println(employee.toString());
        System.out.println(context);
    }
}
