package com.guann1n9.design.pattern.creational.factory.abs.product;

import com.guann1n9.design.pattern.creational.factory.abs.Factory;

public class HuaWeiFactory implements Factory {
    @Override
    public Screen createScreen() {
        return new BoeScreen();
    }

    @Override
    public Cpu createCpu() {
        return new KirinCpu();
    }
}
