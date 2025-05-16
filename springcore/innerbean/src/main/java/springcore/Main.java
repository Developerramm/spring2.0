package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.beans.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext ap = null;
        ap=new ClassPathXmlApplicationContext("config.xml");
        System.out.println(ap);

        User user = null;
        user = ap.getBean("u1",User.class);
        System.out.println(user);
        // user = ap.getBean("u2",User.class);
        // System.out.println(user);
    }
}