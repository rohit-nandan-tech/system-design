package ZomatoLLD;

import java.util.List;

public class NoDiscount implements DiscountStrategy {

    @Override
    public int discount(List<CartItem> cartItemList) {
        // Calculate total amount without any discount
        return 0;
    }

}
