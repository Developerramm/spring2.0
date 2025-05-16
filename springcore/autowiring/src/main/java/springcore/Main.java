package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.beans.Amazon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext ap = null;
        Amazon amazon = null;

        ap = new ClassPathXmlApplicationContext("config.xml");

        amazon = ap.getBean("amazon",Amazon.class);
        amazon.trackMyOrder(1000);
        
        System.out.println(ap);
    }
}