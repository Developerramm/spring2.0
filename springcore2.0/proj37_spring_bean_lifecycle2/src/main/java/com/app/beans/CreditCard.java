package com.app.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class CreditCard {

    private String cardNo;

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "CreditCard [cardNo=" + cardNo + "]";
    }

    @PostConstruct
    public void myinitialize() {
        System.out.println("credit card init invoked");
        if (cardNo == null) {
            throw new IllegalArgumentException("card num is requied");
        }
    }

    @PreDestroy
    public void mydestroy() {
        System.out.println("credit card destroy method invoke");
        cardNo = null;
    }

}
