package pattern.beans;

// dependent spring bean class
public class Delhivery {

    public String trackDeliveryStatus(int orderId) {
        String status = "Your order with orderId " + orderId + " is reached to the nearest hub by today";
        return status;
    }

    public void orderReturnRequest(int orderId) {
        System.out.println("Your order having order id " + orderId
                + " return request is accepted. Our delhivery agent will pick up your order soon.");
    }
}
