package com.guann1n9.design.pattern.behavioral.templeteMethod;

public class HandPullNoodle extends Cook {


    @Override
    void make() {
        System.out.println("拉面");
    }


    @Override
    void addWater() {
        System.out.println("加汤");
    }

    public static void main(String[] args) {
        HandPullNoodle noodle = new HandPullNoodle();
        noodle.noodle();

    }
}
