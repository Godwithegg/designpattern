package com.danhuang;

/**
 * ��������ģʽ���ֳ�Ϊ��̬����ģʽ
 * @author danhuang
 *
 */
public class MainClass {
	public static void main(String[] args){
		//���ƻ������
		FruitFactory appleFactory = new AppleFactory();
		Fruit apple = appleFactory.getFruit();
		apple.get();
		
		//������µ�ˮ������������  ˮ��.java ˮ������.java
	}
}
