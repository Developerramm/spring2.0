package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.beans.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("config.xml");
        System.out.println(ap);

        Employee employee = null;
        employee = ap.getBean("emp", Employee.class);
        System.out.println(employee.toString());
    }
}