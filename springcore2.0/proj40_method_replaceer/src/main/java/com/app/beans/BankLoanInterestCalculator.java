package com.app.beans;

public class BankLoanInterestCalculator {

    public float calLOanInterest(float p, float r, float t) {
        System.out.println("simple interest");
        return (p * t * r) / 100;
    }

}
