package com.company;

public class BurgerRestaurant {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger builderBurger() {
        burgerBuilder.buildBun();
        burgerBuilder.buildSauce();
        burgerBuilder.buildMeat();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSalad();

        return burgerBuilder.build();
    }
}
