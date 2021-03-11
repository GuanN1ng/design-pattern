package com.guann1n9.design.pattern.struct.decorator;



public class MilkDecorator implements Decorator  {

    private Component wrappedComponent;


    public MilkDecorator(Component wrappedComponent) {
        this.wrappedComponent = wrappedComponent;
    }


    //加奶多收3元
    @Override
    public double cost() {
        return 3+wrappedComponent.cost();
    }
}
