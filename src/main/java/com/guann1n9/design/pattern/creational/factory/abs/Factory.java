package com.guann1n9.design.pattern.creational.factory.abs;

import com.guann1n9.design.pattern.creational.factory.abs.product.Cpu;
import com.guann1n9.design.pattern.creational.factory.abs.product.Screen;

public interface Factory {


    Screen createScreen();


    Cpu createCpu();
}
