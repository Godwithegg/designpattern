package com.danhuang;

public class Adapter{
	private Current current;
	public Adapter(Current current) {
		this.current = current;
	}
	public void user18v() {
		System.out.println("ʹ��18v��ȫ��ѹ");
		this.current.user220v();
	}
}
