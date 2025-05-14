package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("config.xml");

        System.out.println(ap);
    }
}