package com.danhuang;

//定义一个出售车子的类，接收售车类型
public class SoldCar {
	private Car car;
	public SoldCar(Car car) {
		this.car = car;
	}
	//真实销售的价格
	public void trueSold(double money) {
		car.sold(money);
	}
}
