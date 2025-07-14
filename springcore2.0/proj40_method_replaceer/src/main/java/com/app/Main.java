package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.BankLoanInterestCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        BankLoanInterestCalculator loanCal = context.getBean("loanCal", BankLoanInterestCalculator.class);

        System.out.println(loanCal.calLOanInterest(1000, 2, 10));

        ((AbstractApplicationContext) context).close();
    }
}