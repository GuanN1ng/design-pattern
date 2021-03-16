package com.guann1n9.design.pattern.behavioral.templeteMethod;

public abstract class Cook {


    /**
     * 模板方法  算法骨架
     */
    public void noodle(){
        boiler();
        make();
        fish();
        addWater();
    }


    public void boiler(){
        System.out.println("开水");
    }


    abstract void make();


    public void fish(){
        System.out.println("捞面");
    }


    /**
     * 钩子方法（hook），默认不做任何事，由子类决定是否覆盖
     */
    void addWater(){}

}
