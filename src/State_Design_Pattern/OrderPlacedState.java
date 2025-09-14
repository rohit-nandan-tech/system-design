package State_Design_Pattern;

public class OrderPlacedState implements OrderState{

    @Override
    public void next(Order order) {
        System.out.println("Order is accepted. Moving in preparation");
        order.setOrderState(new OrderPreparingState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is cancelled at placed state");
        order.setOrderState(new OrderCancel());
    }

    @Override
    public String getStatus(Order order) {
        return "Order " + order.orderId + " is placed.";
    }
}
