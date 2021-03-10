package com.guann1n9.design.pattern.behavioral.observer;

/**
 * 主题/被观察对象
 */
public interface Subject {

    void registObserver(Observer observer);

    void removeObserver(Observer observer);


    void notifyObservers();


}
