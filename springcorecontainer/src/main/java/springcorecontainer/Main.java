package springcorecontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext ap = new ClassPathXmlApplicationContext();
        System.out.println(ap);
    }
}