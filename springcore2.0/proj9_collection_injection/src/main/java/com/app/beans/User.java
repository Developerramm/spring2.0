package com.app.beans;

import java.util.Set;

public class User {

    private Set<Long> phoneNumber;

    private Set<String> email;

    public void setEmail(Set<String> email) {
        this.email = email;
    }

    public void setPhoneNumber(Set<Long> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User [phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }
}
