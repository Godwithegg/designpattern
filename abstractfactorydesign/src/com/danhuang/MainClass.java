package com.danhuang;

/**
 * ���󹤳�ģʽ
 * @author danhuang
 *
 */
public class MainClass {
	public static void main(String[] args) {
		//�õ�һ���Ϸ���ˮ������
		FruitFactory fruitFactory = new NothFruitFactory();
		//ʵ�����Ϸ�ƻ��
		Fruit apple = fruitFactory.getApple();
		//���÷���
		apple.get();
	}
}
