package com.guann1n9.design.pattern.creational.factory.abs.product;

import com.guann1n9.design.pattern.creational.factory.abs.Factory;

public class HuaWeiMobile extends Mobile{

    private Factory factory;


    public HuaWeiMobile(Factory factory) {
        this.factory = factory;
        assembly();
    }

    @Override
    public void assembly() {
        cpu = factory.createCpu();
        screen = factory.createScreen();
    }
}
