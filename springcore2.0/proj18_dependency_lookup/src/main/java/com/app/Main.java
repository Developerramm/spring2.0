package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = null;
        student = (Student) context.getBean("student");

        student.markAttendence();
        student.giveTest();
        student.startOnlineClass();

        System.out.println(student);

        System.out.println(context);
    }
}