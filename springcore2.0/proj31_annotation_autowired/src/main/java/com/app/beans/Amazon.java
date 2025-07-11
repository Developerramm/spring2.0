package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {

    // @Autowired
    private LogisticsService logisticsService;

    @Autowired
    @Qualifier("bluedart")
    public void deliveryPartner(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    public void trackOrder(int orderId) {
        logisticsService.trackOrderLocation(orderId);
    }

}
