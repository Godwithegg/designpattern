package com.danhuang;

/**
 * 简单工厂模式
 * @author danhuang
 *
 */
public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Fruit apple = FruitFactory.getFruit("com.danhuang.Banana");
		apple.get();
	}
}
