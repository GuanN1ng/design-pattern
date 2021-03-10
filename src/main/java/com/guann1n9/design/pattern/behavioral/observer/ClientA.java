package com.guann1n9.design.pattern.behavioral.observer;

public class ClientA implements Observer {

    private Subject subject;


    public ClientA(Subject subject) {
        this.subject = subject;
        this.subject.registObserver(this);
    }

    @Override
    public void update(Object object) {
        System.out.println("ClientA");
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
