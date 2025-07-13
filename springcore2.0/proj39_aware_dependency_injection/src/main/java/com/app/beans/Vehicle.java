package com.app.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class Vehicle implements ApplicationContextAware {

    private String dependentBeanId;
    private ApplicationContext context;

    public void musicSystem() {
        System.out.println("music system turn on");
    }

    public void horn() {
        System.out.println("horn blown");
    }

    public void journey() {
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

}
