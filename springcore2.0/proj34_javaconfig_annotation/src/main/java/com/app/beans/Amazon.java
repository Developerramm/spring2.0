package com.app.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Amazon {

    @Inject
    @Named("delhivery")
    private LogisticsService logisticsService;

    @Override
    public String toString() {
        return "Amazon [logisticsService=" + logisticsService + "]";
    }

}
