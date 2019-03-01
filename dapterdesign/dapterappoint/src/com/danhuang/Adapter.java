package com.danhuang;

public class Adapter{
	private Current current;
	public Adapter(Current current) {
		this.current = current;
	}
	public void user18v() {
		System.out.println("使用18v安全电压");
		this.current.user220v();
	}
}
