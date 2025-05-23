package springcore.beans;

public class EcomExpress implements LogisticsService {

    @Override
    public void trackOrder(int orderId) {
        System.out.println("Your orderId " + orderId + " is reached to the nearest hub. It deliver today by EcomExpress");
    }

}
