package com.test.pattern.construct.Decorator;


/**
 * 装饰器模式
 * */
public class DecoratorTest {  
	  
    public static void main(String[] args) {  
        Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();  
    }  
}  
