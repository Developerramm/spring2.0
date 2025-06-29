package com.spring.beans;

public class User {
    private String name;
    private String email;
    private String pass;

    private int roll;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", pass=" + pass + ", roll=" + roll + "]";
    }
}
