package com.test.pattern.construct.Adapter;

/**
 * 对象的适配器模式
 * 不继承Source类，而是持有Source类的实例
 * */
public class Wrapper implements Targetable {  
	  
    private Source source;  
      
    public Wrapper(Source source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
  
    @Override  
    public void method1() {  
        source.method1();  
    }  
}  