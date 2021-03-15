package com.guann1n9.design.pattern.creational.factory.method;

public abstract class Creator {


    //不变的部分
    void usePhone(){
        MobileProduct product = factoryMethod();
        product.use();

    }


    //变化的部分
    abstract MobileProduct factoryMethod();

}
