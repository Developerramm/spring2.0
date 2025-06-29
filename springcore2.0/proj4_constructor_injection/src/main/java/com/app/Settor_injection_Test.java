package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Student;

public class Settor_injection_Test {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) context.getBean("student");
        student.startMyCourse();
        System.out.println(student);
        System.out.println("----------------------------------------");
        System.out.println(context);
    }
}
