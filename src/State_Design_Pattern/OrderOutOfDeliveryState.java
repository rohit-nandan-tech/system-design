package State_Design_Pattern;

public class OrderOutOfDeliveryState implements OrderState{

    @Override
    public void next(Order order) {
        System.out.println("Order is Out of delivery.");
        order.setOrderState(new OrderOutOfDeliveryState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is cancelled at out of delivery state");
        order.setOrderState(new OrderCancel());
    }

    @Override
    public String getStatus(Order order) {
        return "Order " + order.orderId + " is out of delivery.";
    }
}
