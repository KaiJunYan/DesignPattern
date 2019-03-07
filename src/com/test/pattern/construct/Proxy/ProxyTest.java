package com.test.pattern.construct.Proxy;


/**
 * (静态)代理模式测试
 * */
public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}
