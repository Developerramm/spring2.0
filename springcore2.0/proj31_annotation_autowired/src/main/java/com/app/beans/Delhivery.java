package com.app.beans;

public class Delhivery implements LogisticsService {

    @Override
    public void trackOrderLocation(int orderId) {
        System.out.println(
                "Your order id " + orderId + " is reached to the nearest hub . It is deliver by Delhivery agent ");
    }

}
