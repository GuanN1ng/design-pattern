package com.guann1n9.design.pattern.create.factory.method;

public class HuaWeiCreator extends Creator {

    @Override
    MobileProduct factoryMethod() {
        return new HuaWeiMobileProduct();
    }


    public static void main(String[] args) {
        HuaWeiCreator huaWeiCreator = new HuaWeiCreator();
        huaWeiCreator.usePhone();
    }
}
