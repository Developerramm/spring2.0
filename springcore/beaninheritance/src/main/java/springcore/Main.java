package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.beans.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("config.xml");

        Car car = null;
        car = ap.getBean("car",Car.class);
        System.out.println(car);

        car = ap.getBean("car2",Car.class);
        System.out.println(car);

        System.out.println(ap);
    }
}