package com.app.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;

// @Component
@Named
public class Employee {

    @Value("Ram Kumar")
    private String name;

    @Value("30")
    private int age;

    @Value("${emp.desgn}")
    private String designation;

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", designation=" + designation + "]";
    }

}
