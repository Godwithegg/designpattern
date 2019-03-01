package com.danhuang;

/**
 * 定义一个出售大车的方法，实现Car接口，打九折出售
 * @author danhuang
 *
 */
public class BigCar implements Car{
	@Override
	public void sold(double money) {
		System.out.println("出售大车的价格为:"+money*0.9);
	}
}
