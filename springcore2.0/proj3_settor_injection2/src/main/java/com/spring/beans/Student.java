package com.spring.beans;

public class Student {

    private String username;
    private String name;
    private String email;

    private Course course;

    public Student() {
        System.out.println("Student.Student()");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void StartMyCourse() {
        String msg = "Hello " + name + " username " + username + " email " + email;
        System.out.println(msg);
        course.startCourse();
    }

}
