package com.danhuang;

//�Ϸ�ˮ��ʵ����
public class SouthFruitFactory implements FruitFactory {

	//�Ϸ���ƻ��
	public Fruit getApple() {
		return new SouthApple();
	}

}
