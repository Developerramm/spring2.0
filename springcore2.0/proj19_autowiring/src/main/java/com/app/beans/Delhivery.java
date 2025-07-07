package com.app.beans;

public class Delhivery implements LogisticesService {
    @Override
    public void trackOrder(int orderId) {
        System.out.println("Your order id " + orderId
                + " is reached to the nearest hub. it si delivered by today by Delhivery agent");
    }
}
