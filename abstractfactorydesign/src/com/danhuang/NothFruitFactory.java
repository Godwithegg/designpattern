package com.danhuang;

/**
 * ����ˮ������ʵ����
 * @author danhuang
 *
 */
public class NothFruitFactory implements FruitFactory {

	//������ƻ��
	public Fruit getApple() {
		return new NothApple();
	}

}
