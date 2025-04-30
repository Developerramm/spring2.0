package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ap);

        User user = (User) ap.getBean("user");
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPass());
    }
}