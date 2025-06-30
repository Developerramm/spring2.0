package com.app.beans;

public class EcomExpress implements LogisticsService {

    @Override
    public String checkDeliveryStatus(int orderId) {
        String status = "Your order id " + orderId
                + " is reached to the nearest hub. It'll be delivered today by EcomExpress delivery agent";
        return status;
    }

    @Override
    public String orderReturnRequest(int orderId) {
        String returnRequestStatus = "Your order id " + orderId
                + " return request is accepted. EcomExpress agent will pick up your item soon.";
        return returnRequestStatus;
    }

    @Override
    public String orderReplaceRequest(int orderId) {
        String replaceStatus = "A replace request is accepted. EcomExpress agent will pick up your item soon. Please keep item with the original inovice.";
        return replaceStatus;
    }

}
