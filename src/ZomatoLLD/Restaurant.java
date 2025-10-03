package ZomatoLLD;

import java.util.List;

public class Restaurant {
    String restaurantId ;
    List<MenuItem> menuItems;

    public Restaurant(String restaurantId, List<MenuItem> menuItems) {
        this.restaurantId = restaurantId;
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId='" + restaurantId + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
