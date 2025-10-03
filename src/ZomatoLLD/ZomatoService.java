package ZomatoLLD;

import java.util.ArrayList;
import java.util.List;

public class ZomatoService {
    FoodDao foodDao;
    List<CartItem> cartItems;
    CartService cartService;
    DiscountStrategy discountStrategy;
    PaymentService paymentService;
    Interpreter interpreter;
    int amt;

    public ZomatoService(FoodDao foodDao, CartService cartService, DiscountStrategy discountStrategy, PaymentService paymentService, Interpreter interpreter) {
        this.foodDao = foodDao;
        this.cartItems = new ArrayList<>();
        this.cartService = cartService;
        this.discountStrategy = discountStrategy;
        this.paymentService = paymentService;
        this.interpreter = interpreter;
        this.amt = 0;
    }

    List<MenuItem> find(String input){
        List<MenuItem> menuItemList =  foodDao.find(input);
        if(menuItemList.isEmpty()) System.out.println(input + " is not available.");
        menuItemList = filter(menuItemList);
        return menuItemList;
    }

    void add(MenuItem menuItem, int qty){
        cartService.add(cartItems, menuItem, qty);
        System.out.println(qty + " quantity of " + menuItem.name + " is added");
    }

    void remove(MenuItem menuItem, int qty){
        cartService.remove(cartItems, menuItem, qty);
        System.out.println("Removed " +  qty + " quantity of " + menuItem.name);
    }

    void checkOut(){
        if(cartItems.isEmpty()) System.out.println("Please add item.");
        amt = discountStrategy.discount(cartItems);

        int sum = cartItems.stream().mapToInt(cartItems -> cartItems.qty).sum();
        if(amt != 0)
            System.out.println("You got the discount of " + amt);

    }

    void pay(){
        paymentService.pay(amt);
        System.out.println("Order is placed successfully");
    }

    List<MenuItem> filter(List<MenuItem> menuItems){

        List<MenuItem> menuItemList = menuItems.stream().filter(menuItem -> interpreter.interpret(menuItem)).toList();
        System.out.println("<-------------------Following are the filtered items----------------------------------->");
        menuItemList.forEach(menuItem-> System.out.println(menuItem + "\n"));
        return menuItemList;
    }
}
