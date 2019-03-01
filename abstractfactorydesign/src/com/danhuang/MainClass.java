package com.danhuang;

/**
 * 抽象工厂模式
 * @author danhuang
 *
 */
public class MainClass {
	public static void main(String[] args) {
		//得到一个南方的水果工厂
		FruitFactory fruitFactory = new NothFruitFactory();
		//实例化南方苹果
		Fruit apple = fruitFactory.getApple();
		//调用方法
		apple.get();
	}
}
