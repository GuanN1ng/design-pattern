package com.guann1n9.design.pattern.struct.decorator;



public class SugarDecorator implements Decorator  {

    private Component wrappedComponent;


    public SugarDecorator(Component wrappedComponent) {
        this.wrappedComponent = wrappedComponent;
    }


    //加糖多收1元
    @Override
    public double cost() {
        return 1+wrappedComponent.cost();
    }
}
