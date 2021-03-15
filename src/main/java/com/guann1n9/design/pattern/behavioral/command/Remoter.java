package com.guann1n9.design.pattern.behavioral.command;

/**
 * invoker
 */
public class Remoter {

    private Command command;

    public Remoter() {
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }


    void pressOn(){
        command.execute();
    }
}
