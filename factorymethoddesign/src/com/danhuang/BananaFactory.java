package com.danhuang;

//���幤��
public class BananaFactory implements FruitFactory{

	public Fruit getFruit() {
		return new Banana();
	}
	
}
