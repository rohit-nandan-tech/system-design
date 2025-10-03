package Interpreter_Design_Pattern;

public class IndianCuisineInterpreter implements Interpreter{

    @Override
    public boolean interpret(Restaurant restaurant) {
        return restaurant.cuisine.equals("Indian");
    }
}
