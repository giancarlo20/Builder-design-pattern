package com.company;

public class EggBurgerBuilder extends BurgerBuilder {
    @Override
    void buildBun() {
        burger.setBun("Pan blanco");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Carne de pollo");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Pepino");

    }

    @Override
    void buildSauce() {
        burger.setSauce("Salsa de tomate");

    }

    @Override
    void buildCheese() {
        burger.setCheese("Queso con huevo");

    }
}
