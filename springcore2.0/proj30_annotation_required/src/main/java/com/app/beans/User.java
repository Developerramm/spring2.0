package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class User {

    private String name;

    private String email;

    private Date date;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Required
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", date=" + date + "]";
    }

}
