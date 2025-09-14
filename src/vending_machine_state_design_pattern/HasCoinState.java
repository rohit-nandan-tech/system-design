package vending_machine_state_design_pattern;

public class HasCoinState implements State{

    VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void pressButton() {
        System.out.println("Coin is already inserted");
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is already inserted, Please select item.");
    }

    @Override
    public void itemSelection(String item) {
        if(!vendingMachine.items.contains(item)){
            System.out.println(item + " is not present in vending machine. Please select another item.");
        }
        else{
            System.out.println(item + " is selected");
            vendingMachine.setState(new DispenseState(vendingMachine) );
        }

    }

    @Override
    public void dispense() {
        System.out.println("Please Select the for dispense.");
    }


}
