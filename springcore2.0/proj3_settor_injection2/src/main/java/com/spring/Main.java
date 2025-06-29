package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) context.getBean("student");
        student.StartMyCourse();

        System.out.println(context);
    }
}