package com.danhuang;

//具体工厂
public class AppleFactory implements FruitFactory{

	public Fruit getFruit() {
		return new Apple();
	}

}
