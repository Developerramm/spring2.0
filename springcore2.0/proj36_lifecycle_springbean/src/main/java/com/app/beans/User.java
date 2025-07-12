package com.app.beans;

import java.util.Date;

public class User {

    private String name;

    private Date date;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", date=" + date + "]";
    }

    public void initialize() {
        System.out.println("init method invoke here ");

        if (date == null) {
            throw new IllegalArgumentException("DoB not found ");
        }
    }

    public void destroy() {
        System.out.println("destroy method call");
        name = null;
        date = null;
    }

}
