package com.danhuang;

//����һ�����۳��ӵ��࣬�����۳�����
public class SoldCar {
	private Car car;
	public SoldCar(Car car) {
		this.car = car;
	}
	//��ʵ���۵ļ۸�
	public void trueSold(double money) {
		car.sold(money);
	}
}
