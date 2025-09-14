package vending_machine_state_design_pattern;

import java.util.List;

public class VendingMachine {
    List<String> items;
    State state;

    public VendingMachine(List<String> items) {
        this.items = items;
        this.state = new NoCoinState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<String> getItemsList(){
        return items;
    }

    public void pressingButton(){
        state.pressButton();
    }

    public void insertingCoin(){
        state.insertCoin();
    }

    public void selectingItem(String item){
        state.itemSelection(item);
    }

    public void dispensingItem(){
        state.dispense();
    }
}
