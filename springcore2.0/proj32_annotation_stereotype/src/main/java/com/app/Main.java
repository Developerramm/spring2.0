package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = context.getBean("student", Student.class);
        student.setName("ram kumar");

        System.out.println(student);

        ((AbstractApplicationContext) context).close();
    }
}