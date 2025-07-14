package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.beans.Holidays;
import com.app.config.MyAppConfig;

public class JavaCodeConfigTest {

    public static void main(String[] args) {
        ApplicationContext context = null;

        context = new AnnotationConfigApplicationContext(MyAppConfig.class);

        Holidays holidays = context.getBean("holiday", Holidays.class);
        holidays.checkHoliday();

        ((AbstractApplicationContext) context).close();
    }

}
