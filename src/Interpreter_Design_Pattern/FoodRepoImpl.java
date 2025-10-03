package Interpreter_Design_Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FoodRepoImpl implements FoodRepo{

    List<Restaurant> restaurants = new ArrayList<>();

    public FoodRepoImpl() {
        this.restaurants.add(new Restaurant(UUID.randomUUID().toString(), "Bhagat Halwai", "Indian", 4.2));
        this.restaurants.add(new Restaurant(UUID.randomUUID().toString(), "Italian Food", "Italian", 3));
        this.restaurants.add(new Restaurant(UUID.randomUUID().toString(), "China Town", "Chinese", 3.2));
        this.restaurants.add(new Restaurant(UUID.randomUUID().toString(), "Mughal Hau;", "Mughalai", 4));
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurants;
    }
}
