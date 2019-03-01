package com.danhuang;

//定义一个出售小车的方法，实现Car接口，打八折出售
public class SmallCar implements Car{

	@Override
	public void sold(double money) {
		System.out.println("出售小车的价格为:"+money*0.8);
	}
	
}
