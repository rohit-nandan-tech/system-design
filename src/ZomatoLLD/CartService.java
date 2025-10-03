package ZomatoLLD;

import java.util.List;

public interface CartService {
    void add(List<CartItem> cartItems, MenuItem menuItem, int qty);
    public void remove(List<CartItem> cartItems, MenuItem menuItem, int qty);
}
