package com.danhuang;

/**
 * ������ģʽ��ͨ��ί��ʵ��
 * ���ܣ�220v�޷�����ͻ�����ͨ����������ʵ��18v�����ķ�����ͬʱ������ԭ�еķ���
 * ���ƣ�����������ֻҪ�����������ͺ��ˣ�����Ҫ��Դ������д�����޸�
 * @author danhuang
 *
 */
public class MainCurrent {
	public static void main(String[] args) {
		Adapter current = new Adapter(new Current());
		current.user18v();
	}
}
