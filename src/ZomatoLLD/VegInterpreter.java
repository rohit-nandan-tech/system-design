package ZomatoLLD;

import java.util.Objects;

//terminal Interpreter
public class VegInterpreter implements Interpreter{
    @Override
    public boolean interpret(MenuItem menuItem) {
        return Objects.equals(menuItem.category, "Veg");
    }
}
