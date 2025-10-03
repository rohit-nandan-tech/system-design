package ZomatoLLD;

import java.util.List;

public class CartServiceImpl implements CartService{

    @Override
    public void add(List<CartItem> cartItems, MenuItem menuItem, int qty) {
        if(cartItems.isEmpty() || cartItems.getFirst().menuItems.restaurant.equals(menuItem.restaurant)) cartItems.add(new CartItem(menuItem, qty));
    }

    @Override
    public void remove(List<CartItem> cartItems, MenuItem menuItem, int qty) {
        cartItems.removeIf(cartItem -> cartItem.menuItems.equals(menuItem));
    }
}
