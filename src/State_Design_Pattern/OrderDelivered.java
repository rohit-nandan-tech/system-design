package State_Design_Pattern;

public class OrderDelivered implements OrderState {

    @Override
    public void next(Order order) {
        System.out.println("Order is delivered.");
        order.setOrderState(new OrderOutOfDeliveryState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cant be cancelled");

    }

    @Override
    public String getStatus(Order order) {
        return "Order " + order.orderId + " is delivered";
    }
}
