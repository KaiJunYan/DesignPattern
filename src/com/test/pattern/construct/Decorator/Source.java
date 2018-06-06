package com.test.pattern.construct.Decorator;

//Source类是被装饰类
public class Source implements Sourceable {  
	  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
}  
