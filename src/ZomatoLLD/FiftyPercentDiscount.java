package ZomatoLLD;

import java.util.List;

public class FiftyPercentDiscount implements DiscountStrategy{
    @Override
    public int discount(List<CartItem> cartItemList) {
        int sum =  cartItemList.stream().mapToInt(cartItem -> cartItem.qty * cartItem.menuItems.price).sum();

        return (int) Math.ceil(sum * 0.5);
    }
}
