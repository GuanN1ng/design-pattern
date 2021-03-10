package com.guann1n9.design.pattern.behavioral.observer;

public class ClientB implements Observer {

    private Subject subject;


    public ClientB(Subject subject) {
        this.subject = subject;
        this.subject.registObserver(this);
    }

    @Override
    public void update(Object object) {
        System.out.println("ClientB....");
    }


}
