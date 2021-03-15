package com.guann1n9.design.pattern.structural.decorator;

public class Order {


    public static void main(String[] args) {

        Component blackCoffee = new BlackCoffeeComponent();
        //加奶
        blackCoffee = new MilkDecorator(blackCoffee);
        //加糖
        blackCoffee = new SugarDecorator(blackCoffee);

        System.out.println(blackCoffee.cost());


    }
}
