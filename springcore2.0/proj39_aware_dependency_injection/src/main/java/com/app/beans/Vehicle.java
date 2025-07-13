package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Vehicle {

    private String dependentBeanId;

    public void musicSystem() {
        System.out.println("music system turn on");
    }

    public void horn() {
        System.out.println("horn blown");
    }

    public void journey(ApplicationContext context) {
        // here only engine is required

        // ApplicationContext context = null;
        // context = new ClassPathXmlApplicationContext("config.xml");

        Engine engine = context.getBean(dependentBeanId, Engine.class);

        engine.startEngine();
        System.out.println("journey continued , and reached to the destination");
        engine.stopEngine();

        ((AbstractApplicationContext)context).close();

    }

    public void headlight() {
        System.out.println("head light turn on");
    }

    public void setDependentBeanId(String dependentBeanId) {
        this.dependentBeanId = dependentBeanId;
    }

}
