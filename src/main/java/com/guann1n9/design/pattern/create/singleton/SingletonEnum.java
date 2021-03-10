package com.guann1n9.design.pattern.create.singleton;

public enum SingletonEnum {

    INSTANCE;


    private String desc = "hello";


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public static void main(String[] args) {
        System.out.println(INSTANCE.getDesc());
    }
}
