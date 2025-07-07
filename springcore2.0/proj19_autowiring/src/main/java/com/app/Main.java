package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Amazon amazon = null;

        amazon = context.getBean("amazon", Amazon.class);

        System.out.println(amazon);
        amazon.tracMykOrder(1425);

        System.out.println(context);

    }
}