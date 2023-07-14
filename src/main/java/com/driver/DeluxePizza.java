package com.driver;

public class DeluxePizza extends Pizza {

    int price ;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
//        if(isVeg) this.price = 300;
//        else this.price = 400;
        addExtraCheese();
        addExtraToppings();
        base = getPrice();
    }
}
