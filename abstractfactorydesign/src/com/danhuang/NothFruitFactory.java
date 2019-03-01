package com.danhuang;

/**
 * 北方水果工厂实现类
 * @author danhuang
 *
 */
public class NothFruitFactory implements FruitFactory {

	//北方的苹果
	public Fruit getApple() {
		return new NothApple();
	}

}
