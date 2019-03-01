package com.danhuang;

import jdk.nashorn.internal.ir.CatchNode;

/**
 * 工厂类：可以实现其他类的实例,两种方式
 * @author danhuang
 *
 */
public class FruitFactory {
//	//获得实例
//	public static Fruit getApple() {
//		return new Apple();
//	}
//	public static Fruit getBanana() {
//		return new Banana();
//	}
	
//	public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException {
//		if(type.equalsIgnoreCase("apple")) {
//			return Apple.class.newInstance();
//		}else if(type.equalsIgnoreCase("banana")) {
//			return Banana.class.newInstance();
//		}else {
//			System.out.println("找不到对应的实现类");
//			return null;
//		}
//	}
	
	public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}
}
