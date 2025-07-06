package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.CollegeInfo;
import com.app.beans.Faculty;
import com.app.beans.Student;
import com.app.beans.User;

public class CollectionInjectionTest {
    public static void main(String[] args) {

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        Faculty faculty = (Faculty) context.getBean("faculty");
        System.out.println(faculty);

        User user = (User) context.getBean("user");
        System.out.println(user);

        CollegeInfo collegeInfo = (CollegeInfo) context.getBean("info");
        System.out.println(collegeInfo);

        System.out.println(context);
    }
}
