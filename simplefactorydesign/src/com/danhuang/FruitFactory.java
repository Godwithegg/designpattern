package com.danhuang;

import jdk.nashorn.internal.ir.CatchNode;

/**
 * �����ࣺ����ʵ���������ʵ��,���ַ�ʽ
 * @author danhuang
 *
 */
public class FruitFactory {
//	//���ʵ��
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
//			System.out.println("�Ҳ�����Ӧ��ʵ����");
//			return null;
//		}
//	}
	
	public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}
}
