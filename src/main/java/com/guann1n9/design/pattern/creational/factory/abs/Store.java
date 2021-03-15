package com.guann1n9.design.pattern.creational.factory.abs;

import com.guann1n9.design.pattern.creational.factory.abs.product.HuaWeiFactory;
import com.guann1n9.design.pattern.creational.factory.abs.product.HuaWeiMobile;
import com.guann1n9.design.pattern.creational.factory.abs.product.Mobile;

public class Store {

    public static void main(String[] args) {

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Mobile mobile = new HuaWeiMobile(huaWeiFactory);
        mobile.use();

    }
}
