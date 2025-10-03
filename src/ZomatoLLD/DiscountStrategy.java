package ZomatoLLD;

import java.util.List;

public interface DiscountStrategy {
    int discount(List<CartItem>cartItems);
}
