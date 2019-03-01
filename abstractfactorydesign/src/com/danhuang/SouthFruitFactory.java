package com.danhuang;

//南方水果实现类
public class SouthFruitFactory implements FruitFactory {

	//南方的苹果
	public Fruit getApple() {
		return new SouthApple();
	}

}
