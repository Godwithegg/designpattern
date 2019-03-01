package com.danhuang;

//具体工厂
public class BananaFactory implements FruitFactory{

	public Fruit getFruit() {
		return new Banana();
	}
	
}
