package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");
        
        User user = (User)context.getBean("user");
        System.out.println(user.toString());
        System.out.println(context);
    }
}