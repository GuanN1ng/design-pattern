package com.guann1n9.design.pattern.create.factory.abs.product;

import com.guann1n9.design.pattern.create.factory.abs.Factory;

public class SumsangFactory implements Factory {
    @Override
    public Screen createScreen() {
        return new SumsangScreen();
    }

    @Override
    public Cpu createCpu() {
        return new QualCpu();
    }
}
