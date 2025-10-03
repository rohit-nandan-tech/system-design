package ZomatoLLD;

import java.util.List;

public class ZomatoMain {
    public static void main(String[] args){
        FoodDao foodDao = new FoodDaoDB();
        CartService cartService = new CartServiceImpl();
        DiscountStrategy discountStrategy = new FiftyPercentDiscount();
        PaymentService paymentService = new PaymentServiceImpl();

        List<Interpreter> interpreterList = List.of(new VegInterpreter(), new AboveTwoStarInterpreter());

        Interpreter interpreter = new AndTerminalInterpreter(interpreterList);

        ZomatoService zomatoService = new ZomatoService(foodDao, cartService, discountStrategy, paymentService, interpreter);

        List<MenuItem> menuItems = zomatoService.find("Pizza");
        zomatoService.add(menuItems.getFirst(), 2);
//        zomatoService.remove(menuItems.getFirst(),1);

        zomatoService.checkOut();
        zomatoService.pay();


    }
}
