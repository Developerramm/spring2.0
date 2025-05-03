package pattern.beans;

// dependent spring bean
public final class Bluedart implements LogisticsService {

    @Override
    public String checkDeliveryStatus(String orderId) {
        String status = "Your order id " + orderId + " is reached to the nearest hub. it will be deliver today by Bluedart delivery agent.";
        return status;
    }

    @Override
    public String orderReturnRequest(String orderId) {
        String returnRequestStatus = "Your order id " + orderId + " A return request is accepted. Bluedart delivery agent will pick up your item soon.";
       return returnRequestStatus;
    }

    @Override
    public String orderReplaceRequest(String orderId) {
        String replaceStatus = "Your order id " + orderId + " A replace request is accepted. Bluedart delivery agent will pick up your item soon. please keep your item with invoice ready";
        return replaceStatus;
    }


}
