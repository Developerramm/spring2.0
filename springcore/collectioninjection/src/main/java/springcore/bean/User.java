package springcore.bean;

import java.util.Set;

public class User {

    private Set<Long> phoneNumber;
    private Set<String> emailId;


    public void setPhoneNumber(Set<Long> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmailId(Set<String> emailId) {
        this.emailId = emailId;
    }
    @Override
    public String toString() {
        return "User [phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
    }

}
