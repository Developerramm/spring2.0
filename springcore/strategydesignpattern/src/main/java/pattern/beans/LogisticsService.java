package pattern.beans;

public interface LogisticsService {

    public String checkDeliveryStatus(String orderId);
    
    public String orderReturnRequest(String orderId);

    public String orderReplaceRequest(String orderId);


}
