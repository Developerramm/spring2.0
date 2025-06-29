package com.app.beans;

// spring bean class 
public class Student {

    private String name;
    private String email;

    public Student() {
        System.out.println("Default constructor is called");
    }

    public Student(String name, String email) {
        System.out.println("This is parameterized constructor");
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + "]";
    }

}
