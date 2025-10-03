package ZomatoLLD;

public class MenuItem {
    String id;
    String name;
    int price;
    String restaurant;
    String category;
    Integer rate;

    public MenuItem(String id, String name, int price, String restaurant, String category, Integer rate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
        this.category = category;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }
}
