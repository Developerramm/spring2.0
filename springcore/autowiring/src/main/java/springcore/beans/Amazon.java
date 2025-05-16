package springcore.beans;

public class Amazon {

    private LogisticsService logisticsService;

    public void setLogisticsService(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    public void trackMyOrder(int orderId){
        logisticsService.trackOrder(orderId);
    }


}
