package com.danhuang;

/**
 * 工厂方法模式，又称为多态工厂模式
 * @author danhuang
 *
 */
public class MainClass {
	public static void main(String[] args){
		//获得苹果工厂
		FruitFactory appleFactory = new AppleFactory();
		Fruit apple = appleFactory.getFruit();
		apple.get();
		
		//如果有新的水果工厂就增加  水果.java 水果工厂.java
	}
}
