package com.danhuang;

/**
 * ����һ�����۴󳵵ķ�����ʵ��Car�ӿڣ�����۳���
 * @author danhuang
 *
 */
public class BigCar implements Car{
	@Override
	public void sold(double money) {
		System.out.println("���۴󳵵ļ۸�Ϊ:"+money*0.9);
	}
}
