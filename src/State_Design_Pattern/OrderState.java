package State_Design_Pattern;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
    String getStatus(Order order);
}
