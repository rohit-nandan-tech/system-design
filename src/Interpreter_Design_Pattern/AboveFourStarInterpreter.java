package Interpreter_Design_Pattern;

public class AboveFourStarInterpreter implements Interpreter{

    @Override
    public boolean interpret(Restaurant restaurant) {
        return restaurant.rating > 4;
    }
}
