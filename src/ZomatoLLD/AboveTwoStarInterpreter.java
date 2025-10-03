package ZomatoLLD;


//Terminal Interpreter
public class AboveTwoStarInterpreter implements Interpreter{
    @Override
    public boolean interpret(MenuItem menuItem) {
        return menuItem.rate > 2;
    }
}
