package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.AccountHolder;
import com.app.beans.Employee;
import com.app.beans.Student;
import com.app.beans.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        User user = context.getBean("user", User.class);
        Student student = context.getBean("student", Student.class);
        Employee employee = context.getBean("emp", Employee.class);

        AccountHolder accountHolder = context.getBean("ac",AccountHolder.class);

        System.out.println(user);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(accountHolder);

        ((AbstractApplicationContext) context).close();
    }
}