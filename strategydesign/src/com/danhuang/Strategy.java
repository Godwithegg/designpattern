package com.danhuang;

/**
 * 策略模式
 * @author danhuang
 *
 */
public class Strategy {
	public static void main(String[] args) {
		SoldCar soldCar = new SoldCar(new BigCar());
		//100为原价，输出真实价格
		soldCar.trueSold(100);
	}
}
