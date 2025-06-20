package springcoreintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcoreintro.beans.User;

public class Main {
    public static void main(String[] args) {
        // User user = new User();
        // user.showUser();

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");
        User user = context.getBean("user",User.class);
        user.showUser();
        System.out.println(context);
    }
}
