package com.app.beans;

public class Student {

    private String name;
    private int roll;

    private Course course;

    public Student(String name, int roll, Course course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + ", course=" + course + "]";
    }

}
