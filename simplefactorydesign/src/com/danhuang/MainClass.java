package com.danhuang;

/**
 * �򵥹���ģʽ
 * @author danhuang
 *
 */
public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Fruit apple = FruitFactory.getFruit("com.danhuang.Banana");
		apple.get();
	}
}
