package com.app.beans;

// target spring bean class
public class Amazon {

    private LogisticsService logisticsService;

    public Amazon(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    public String checkDeliveryStatus(int orderId) {
        return logisticsService.checkDeliveryStatus(orderId);
    }

    public String returnOrder(int orderId) {
        return logisticsService.orderReturnRequest(orderId);
    }

    public String replaceOrder(int orderId) {
        return logisticsService.orderReplaceRequest(orderId);
    }

}
