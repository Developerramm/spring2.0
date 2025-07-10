package com.app.beans;

public class Amazon {

    private Delhivery delhivery;

    public Amazon() {
        System.out.println("Amazon.Amazon()");
    }

    public void setDelhivery(Delhivery delhivery) {
        this.delhivery = delhivery;
    }

    public void shipOrder(int orderId) {
        System.out.println("Order Shipped " + orderId);
    }

    @Override
    public String toString() {
        return "Amazon [delhivery=" + delhivery + "]";
    }

}
