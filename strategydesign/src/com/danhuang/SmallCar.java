package com.danhuang;

//����һ������С���ķ�����ʵ��Car�ӿڣ�����۳���
public class SmallCar implements Car{

	@Override
	public void sold(double money) {
		System.out.println("����С���ļ۸�Ϊ:"+money*0.8);
	}
	
}
