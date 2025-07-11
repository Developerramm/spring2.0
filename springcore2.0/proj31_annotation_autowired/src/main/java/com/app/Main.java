package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        Amazon amazon = null;

        amazon = context.getBean("amazon", Amazon.class);
        amazon.trackOrder(11233);

        ((AbstractApplicationContext) context).close();

    }
}