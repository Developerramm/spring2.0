package com.app.beans;

public class Course {

    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void startMyCourse() {
        System.out.println("Course is loading here ");
    }
}
