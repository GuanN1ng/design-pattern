package com.guann1n9.design.pattern.structural.composite;

/**
 *组合内所有元素的共同接口，使客户可以一致的操作组合内的所有对象
 * 若无需属性及默认实现的方法，采用interface
 */
public abstract class Component {

    //采用默认实现的方法，子类不支持的操作无需实现
    public void operation(){}

    public void add(Component component){
        throw new UnsupportedOperationException();
    }

    public void remove(Component component){
        throw new UnsupportedOperationException();
    }


}
