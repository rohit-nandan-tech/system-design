package State_Design_Pattern;

public class Order {
    String orderId;
    OrderState orderState;
    public Order(String orderId) {
        this.orderId = orderId;
        orderState = new OrderPlacedState();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void nextState(){
        orderState.next(this);
    }

    public void cancelState(){
        orderState.cancel(this);
    }

    public void trackOrder(){
        System.out.println("Order " + orderId +"->" + orderState.getStatus(this));
    }
}
