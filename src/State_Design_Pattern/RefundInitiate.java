package State_Design_Pattern;

public class RefundInitiate implements OrderState{

    @Override
    public void next(Order order) {
        System.out.println("Refund Initiated");

    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is already cancelled. Refund Initiated");
        order.setOrderState(new OrderCancel());
    }

    @Override
    public String getStatus(Order order) {
        return "Order is cancel for order id "  + order.orderId + ". refund initiated.";
    }
}
