package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        User user = null;
        user = (User) context.getBean("user");
        System.out.println(user);

        user = (User) context.getBean("u1");
        System.out.println(user);

        System.out.println("-------------------------------------");
        System.out.println(context);
    }
}