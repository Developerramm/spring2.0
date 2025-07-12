package com.app.beans;

import javax.inject.Named;

import jakarta.annotation.Resource;

@Named
public class Amazon {

    @Resource
    @Named("delhivery")
    private LogisticsService logisticsService;

    @Override
    public String toString() {
        return "Amazon [logisticsService=" + logisticsService + "]";
    }

}
