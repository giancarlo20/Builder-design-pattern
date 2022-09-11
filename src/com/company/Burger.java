package com.company;

public class Burger {
    private String bun = "No bun";
    private String meat = "No meat";
    private String salad = "No salad";
    private String sauce = "No sauce";
    private String cheese = "No cheese";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                '}';
    }
}
