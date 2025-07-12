package com.app.beans;

import org.springframework.stereotype.Component;

@Component(value = "student")
public class Student {

    private String name;

    public Student() {
        System.out.println("Student.Student()");
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

}
