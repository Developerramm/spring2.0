package springcorecontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcorecontainer.beans.User;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("springcorecontainer/config/beanConfig.xml");
        System.out.println(ap);
        // System.out.println(ap.getClass().getName());

        User user = ap.getBean("user",User.class);
        // user.setName("Ram Kumar");
        // user.setEmail("rammaniyari@gmail.com");
        // user.setPass("123654789");
        user.showUser();

    }
}