package vending_machine_state_design_pattern;

public class DispenseState implements State{

    VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
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
        System.out.println("Item is already selected, Wait for dispense");
    }

    @Override
    public void dispense() {
        System.out.println("Item is dispensing");
    }


}
