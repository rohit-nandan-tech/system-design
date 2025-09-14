package State_Design_Pattern;

public class OrderCancel implements OrderState{

    @Override
    public void next(Order order) {
        System.out.println("Order is cancelled");
        order.setOrderState(new RefundInitiate());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is already cancelled");

    }

    @Override
    public String getStatus(Order order) {
        return "Order " + order.orderId + " is cancel";
    }
}
