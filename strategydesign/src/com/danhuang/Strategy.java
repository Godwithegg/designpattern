package com.danhuang;

/**
 * ����ģʽ
 * @author danhuang
 *
 */
public class Strategy {
	public static void main(String[] args) {
		SoldCar soldCar = new SoldCar(new BigCar());
		//100Ϊԭ�ۣ������ʵ�۸�
		soldCar.trueSold(100);
	}
}
