package com.guann1n9.design.pattern.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题
 */
public class WeatherData implements Subject {


    private List<Observer> list;


    public WeatherData() {
        this.list = new ArrayList<Observer>();
    }

    @Override
    public void registObserver(Observer observer) {
        if(observer == null || list.contains(observer)){
            return;
        }
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer == null){
            return;
        }
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach(i->i.update("iii"));
    }


    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ClientA clientA = new ClientA(weatherData);
        ClientB clientB = new ClientB(weatherData);
        weatherData.notifyObservers();
    }


}
