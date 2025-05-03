package pattern.beans;

// dependent spring bean
public class Bluedart {

    public String trackOrderStatsu(int order){
        return "Order id " + order + " is reached to nearest hub";
    }

    public void returnOrderRequest(int orderId){
        System.out.println("Your order having order id " + orderId
                + " return request is accepted. Our Bluedart agent will pick up your order soon.");
    }

}
