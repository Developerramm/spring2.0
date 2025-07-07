package com.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

    private String name;

    private ZoomStreamApi zoomApi;

    public void setName(String name) {
        this.name = name;
    }

    public void markAttendence() {
        System.out.println("Attendence done");
    }

    public void giveTest() {
        System.out.println("test is started");
    }

    public void viewExamResutl() {
        System.out.println("Result checked successful");
    }

    public void startOnlineClass() {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");
        zoomApi = context.getBean("zoomApi", ZoomStreamApi.class);
        zoomApi.streamVideoOnlineClass();
        System.out.println(context);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

}
