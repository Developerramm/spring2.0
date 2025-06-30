package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class DependencyInjction_StrategyDp_Test {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        Amazon amazon = (Amazon) context.getBean("amazon");
        System.out.println(amazon.checkDeliveryStatus(1010));
        System.out.println(amazon.returnOrder(1222));
        System.out.println(amazon.replaceOrder(2000));

        System.out.println("------------------------------------");
        System.out.println(context);
    }
}
