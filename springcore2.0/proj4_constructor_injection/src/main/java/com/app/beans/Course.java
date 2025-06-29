package com.app.beans;

public class Course {

    private String name;

    public void startCourse() {
        System.out.println("Course is loading here ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
