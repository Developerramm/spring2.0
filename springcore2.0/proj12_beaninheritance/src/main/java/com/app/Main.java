package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Car car = (Car) context.getBean("car1");
        System.out.println(car);

        car = (Car) context.getBean("car2");
        System.out.println(car);

        System.out.println(context);

    }
}