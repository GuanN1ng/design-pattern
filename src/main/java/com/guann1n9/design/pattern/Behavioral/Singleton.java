package com.guann1n9.design.pattern.Behavioral;


/**
 * 单例模式  确保一个进程中有且只有一个该类的实例对象，并提供一个访问它的全局访问点
 *
 * 构造函数私有
 * 提供静态访问方法
 */
public class Singleton {

    static {
        System.out.println("init");
    }

    //例 Runtime.class
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }


    //避免使用double-check http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html




    private Singleton() { }
}
