package Interpreter_Design_Pattern;

import java.util.List;

public class OrInterpreter implements Interpreter{

    List<Interpreter> interpreterList;

    public OrInterpreter(List<Interpreter> interpreterList) {
        this.interpreterList = interpreterList;
    }

    @Override
    public boolean interpret(Restaurant restaurant) {
        return interpreterList.stream().anyMatch(interpreter -> interpreter.interpret(restaurant));
    }
}
