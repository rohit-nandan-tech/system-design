package vending_machine_state_design_pattern;


public class NoCoinState implements State{
    VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void pressButton() {
        if(vendingMachine.items.isEmpty())
            System.out.println("No item is present in vending machine");
        else
            System.out.println("Please insert this coin");
    }

    @Override
    public void insertCoin() {
        if(vendingMachine.items.isEmpty())
            System.out.println("No item is present in vending machine");
        else{
            System.out.println("Coin has been inserted.");
            vendingMachine.setState(new HasCoinState(vendingMachine));
        }
    }

    @Override
    public void itemSelection(String item) {
        if(vendingMachine.items.isEmpty())
            System.out.println("No item is present in vending machine");
        else
            System.out.println("Please insert the coin first");
    }

    @Override
    public void dispense() {
        if(vendingMachine.items.isEmpty())
            System.out.println("No item is present in vending machine.");
        else
            System.out.println("No item is selected for dispense.");
    }


}
