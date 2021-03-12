package com.guann1n9.design.pattern.create.factory.abs.product;

public abstract class Mobile {

    protected Cpu cpu;

    protected Screen screen;


    public abstract void assembly();

    public void use(){
        System.out.println("get mobile Cpu"+cpu.getClass().getName() + "screen:"+screen.getClass().getName());
    }
}
