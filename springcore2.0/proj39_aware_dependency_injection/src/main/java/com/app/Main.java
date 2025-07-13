package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

        System.out.println(vehicle);

        vehicle.musicSystem();
        vehicle.horn();
        vehicle.journey();

        ((AbstractApplicationContext) context).close();

    }
}