package ZomatoLLD;

import java.util.List;

public class AndTerminalInterpreter implements Interpreter{
    List<Interpreter> interpreterList;

    public AndTerminalInterpreter(List<Interpreter> interpreterList) {
        this.interpreterList = interpreterList;
    }

    @Override
    public boolean interpret(MenuItem menuItem) {
        return interpreterList.stream().allMatch(interpreter -> interpreter.interpret(menuItem));
    }
}
