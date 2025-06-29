package com.app.beans;

// spring bean class 
public class Student {

    private String name;
    private String email;

    private Course course;

    public Student() {
        System.out.println("Default constructor is called");
    }

    public Student(String name, String email, Course course) {
        System.out.println("This is parameterized constructor");
        this.name = name;
        this.email = email;
        this.course = course;
    }
    public void startMyCourse(){
        System.out.println("Course name is " + course.getName());
        course.startCourse();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + ", course=" + course + "]";
    }

}
