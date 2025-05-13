package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.bean.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("config.xml");

        Student student = null;
        student = ap.getBean("student", Student.class);
        System.out.println(student.toString());

        System.out.println(ap);
    }
}