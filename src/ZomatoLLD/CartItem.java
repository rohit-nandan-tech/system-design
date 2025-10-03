package ZomatoLLD;

public class CartItem {
    MenuItem menuItems;
    int qty;

    public CartItem(MenuItem menuItems, int qty) {
        this.menuItems = menuItems;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "menuItems=" + menuItems +
                ", qty=" + qty +
                '}';
    }
}
