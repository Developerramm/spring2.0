package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Settor_injection_Test {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.hashCode());
        System.out.println(student.toString());
        System.out.println(student);
        System.out.println(context);
    }
}
