package com.guann1n9.design.pattern.behavioral.command;

public class Client {


    public static void main(String[] args) {

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        Remoter remoter = new Remoter();
        remoter.setCommand(lightOnCommand);
        remoter.pressOn();

    }
}
