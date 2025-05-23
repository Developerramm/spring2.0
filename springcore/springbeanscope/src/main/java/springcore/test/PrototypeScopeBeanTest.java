package springcore.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.beans.Faculty;

public class PrototypeScopeBeanTest {
    public static void main(String[] args) {
        ApplicationContext ap = null;

        ap= new ClassPathXmlApplicationContext("config.xml");

        Faculty f1 = ap.getBean("faculty",Faculty.class);
        System.out.println(f1.hashCode());
        Faculty f2 = ap.getBean("faculty",Faculty.class);
        System.out.println(f2.hashCode());

        Faculty f3 = ap.getBean("faculty",Faculty.class);
        System.out.println(f3.hashCode());
        System.out.println(ap);
    }
}
