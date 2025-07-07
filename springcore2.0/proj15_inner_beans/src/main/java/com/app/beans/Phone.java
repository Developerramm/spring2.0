package com.app.beans;

public class Phone {

    private String phoneNo;

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "Phone [phoneNo=" + phoneNo + "]";
    }

}
