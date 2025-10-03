package Interpreter_Design_Pattern;

import java.util.List;

public class AndInterpreter implements Interpreter{

    List<Interpreter> interpreterList;

    public AndInterpreter(List<Interpreter> interpreterList) {
        this.interpreterList = interpreterList;
    }

    @Override
    public boolean interpret(Restaurant restaurant) {
        return interpreterList.stream().allMatch(interpreter -> interpreter.interpret(restaurant));
    }
}
