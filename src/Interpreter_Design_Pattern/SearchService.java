package Interpreter_Design_Pattern;

import java.util.List;

public class SearchService {
    Interpreter interpreter;

    public SearchService(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    List<Restaurant> filter(List<Restaurant> restaurants){
        return restaurants.stream().filter(restaurant -> interpreter.interpret(restaurant)).toList();
    }

}

