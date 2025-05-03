package pattern.beans;

// target spring bean class
public class Amazon {

    private Delhivery delhivery;

    public Amazon(Delhivery delhivery) {
        this.delhivery = delhivery;
    }

    public String checkDeliveryStatus(int orderId) {
        return delhivery.trackDeliveryStatus(orderId);
    }

    public void returnOrder(int orderId) {
        delhivery.orderReturnRequest(orderId);
    }

}
