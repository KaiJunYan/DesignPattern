package com.test.pattern.construct.Adapter;


/**
 * 类的适配器的测试
 * */
public class AdapterTest {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		//执行的是Source里面方法，适配成功
		target.method1();
		target.method2();
	}
}
