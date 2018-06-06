package com.test.pattern.construct.Adapter;

/**
 * 对象适配器的测试
 * */
public class WrapperTest {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
