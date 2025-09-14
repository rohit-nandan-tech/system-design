package State_Design_Pattern;

public class OrderPreparingState implements OrderState{

    @Override
    public void next(Order order) {
        System.out.println("Order is prepared. Moving for delivery");
        order.setOrderState(new OrderOutOfDeliveryState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is cancelled at preparation state");
        order.setOrderState(new OrderCancel());
    }

    @Override
    public String getStatus(Order order) {
        return "Order " + order.orderId + " is prepared.";
    }
}
