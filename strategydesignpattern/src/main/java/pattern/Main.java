package pattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pattern.beans.Amazon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ap);

        Amazon amazon = (Amazon) ap.getBean("amazon");

        String status = amazon.checkDeliveryStatus(12365);
        System.out.println(status);
        
    }
}