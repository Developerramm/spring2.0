package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = null;

        student = context.getBean("s1", Student.class);

        System.out.println(student);

        student = (Student) context.getBean("s2");
        System.out.println(student);

        System.out.println(context);
    }
}