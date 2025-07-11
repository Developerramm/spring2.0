package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        User user = null;

        user = (User) context.getBean("user");

        System.out.println(user);

        ((AbstractApplicationContext) context).close();

    }
}