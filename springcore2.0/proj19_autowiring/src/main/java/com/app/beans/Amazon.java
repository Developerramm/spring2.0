package com.app.beans;

public class Amazon {

    private LogisticesService logisticesService;

    public void setLogisticesService(LogisticesService logisticesService) {
        this.logisticesService = logisticesService;
    }

    public void tracMykOrder(int orderId) {
        logisticesService.trackOrder(orderId);
    }

    

}
