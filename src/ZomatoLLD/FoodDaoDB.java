package ZomatoLLD;

import java.util.ArrayList;
import java.util.List;

public class FoodDaoDB implements FoodDao{

    List<MenuItem> menuItems = new ArrayList<>();

    public FoodDaoDB() {
        menuItems.add(new MenuItem("1", "Biryani", 100, "Dilshad Restaurant", "Non Veg", 4));
        menuItems.add(new MenuItem("1", "Pizza", 100, "Domino's", "Veg",  5));
        menuItems.add(new MenuItem("1", "Pizza", 100, "Domino's", "Veg",  4));
        menuItems.add(new MenuItem("1", "Coke", 100, "Domino's","Veg",  3));
        menuItems.add(new MenuItem("1", "Cake", 100, "Cake House", "Non Veg", 4 ));
        menuItems.add(new MenuItem("1", "Pastry", 100, "Cake House", "Non Veg",3 ));
    }

    @Override
    public List<MenuItem> find(String input) {
        List<MenuItem> restaurant = findByRestaurant(input);
        if(!restaurant.isEmpty()) return restaurant;
        return findByFood(input);
    }

    private List<MenuItem> findByRestaurant(String restaurant){

        return this.menuItems.stream().filter(menuItem -> menuItem.restaurant.equals(restaurant)).toList();
    }

    private List<MenuItem> findByFood(String food){
        List<MenuItem> foods = new ArrayList<>();

        for(MenuItem menuItem: this.menuItems){
            if(menuItem.name.equals(food))
                foods.add(menuItem);
        }

        return foods;
    }
}
