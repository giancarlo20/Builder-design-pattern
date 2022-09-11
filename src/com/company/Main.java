package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BurgerRestaurant burgerRestaurant = new BurgerRestaurant();
        burgerRestaurant.setBurgerBuilder(new EggBurgerBuilder());
        buildBurger(burgerRestaurant);
    }

    private static void buildBurger(BurgerRestaurant burgerRestaurant) {
        Burger burger = burgerRestaurant.builderBurger();
        System.out.println(burger.toString());
    }
}
