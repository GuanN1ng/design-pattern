package com.guann1n9.design.pattern.creational.factory.method;


public abstract class MobileProduct {

    //子类可以使用
    protected String color;


    protected String weight;


    protected String brand;


    public void use(){
        System.out.println("i am mobile,my brand:"+brand);
    }



}
