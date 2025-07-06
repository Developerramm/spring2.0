package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Faculty;
import com.app.beans.Student;

public class CollectionInjectionTest {
    public static void main(String[] args) {

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        Faculty faculty = (Faculty) context.getBean("faculty");
        System.out.println(faculty);

        System.out.println(context);
    }
}
