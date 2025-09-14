package vending_machine_state_design_pattern;

public interface State {
    void pressButton();
    void insertCoin();
    void itemSelection(String item);
    void dispense();

}
