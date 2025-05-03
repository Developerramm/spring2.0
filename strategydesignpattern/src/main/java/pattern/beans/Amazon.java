package pattern.beans;

// target spring bean class
public final class Amazon {

    private LogisticsService logisticsService;

    public Amazon(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    public String checkDeliveryStatus(String orderId) {
        return logisticsService.checkDeliveryStatus(orderId);
    }

    public String returnOrder(String orderId) {
        return logisticsService.orderReturnRequest(orderId);
    }

    public String replaceOder(String orderId) {
        return logisticsService.orderReplaceRequest(orderId);
    }

}
