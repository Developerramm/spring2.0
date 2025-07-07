package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Class c1 = context.getBean("c1", Class.class);
        System.out.println(c1);

        System.out.println(context);
    }
}