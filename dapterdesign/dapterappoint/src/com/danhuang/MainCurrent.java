package com.danhuang;

/**
 * 适配器模式，通过委让实现
 * 功能：220v无法满足客户需求，通过适配器来实现18v电流的方法，同时引用了原有的方法
 * 优势：电流更换了只要调正适配器就好了，不需要对源代码进行大面积修改
 * @author danhuang
 *
 */
public class MainCurrent {
	public static void main(String[] args) {
		Adapter current = new Adapter(new Current());
		current.user18v();
	}
}
