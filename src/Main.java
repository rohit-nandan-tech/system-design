import State_Design_Pattern.*;
import vending_machine_state_design_pattern.VendingMachine;

import java.util.List;


public class Main {
    public static void main(String[] args) {
//<----- chain of responsibility----------->
//        SupporterSystem upperSupporterSystem  =  new UpperSupportSystemImpl();
//        SupporterSystem mediumSupportSystem = new MediumSupportSystemImpl(upperSupporterSystem);
//        SupporterSystem baseSupportSystem = new BaseSupportSystemImpl(mediumSupportSystem);
//
//        baseSupportSystem.handle("medu");


        //<----- State design pattern Order State----------->
        Order order = new Order("Anushka");
        order.trackOrder();
        order.nextState();
        order.nextState();
        order.trackOrder();
        order.nextState();
        order.cancelState();

        //<----- chain of responsibility vending machine----------->

//        List<String> items = List.of("Coke", "Biscuit", "Juice", "Water");
//        VendingMachine vendingMachine = new VendingMachine(items);
//
//        vendingMachine.pressingButton();
//        vendingMachine.insertingCoin();
//        vendingMachine.selectingItem("choco");
//        vendingMachine.selectingItem("Coke");
//        vendingMachine.dispensingItem();



    }

}