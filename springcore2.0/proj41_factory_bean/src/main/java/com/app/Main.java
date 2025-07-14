package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.AlarmNote;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        AlarmNote alarmNote = context.getBean("alarm", AlarmNote.class);
        alarmNote.scheduler();

    }
}