package com.guann1n9.design.pattern.behavioral.command;

/**
 * 开灯命令
 */
public class LightOnCommand implements Command {

    private Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
