package Interpreter_Design_Pattern;

import java.util.List;
public class InterpreterDesignPatternMain {
    public static void main(String[] args){
        List<Interpreter> interpreters = List.of(new IndianCuisineInterpreter(), new AboveFourStarInterpreter());

        Interpreter interpreter = new AndInterpreter(interpreters);

        FoodRepo foodRepo = new FoodRepoImpl();

        List<Restaurant> restaurants = foodRepo.findAll();

        restaurants = new SearchService(interpreter).filter(restaurants);

        for (Restaurant restaurant: restaurants){
            System.out.println(restaurant.name + "\n");
        }
    }
}
