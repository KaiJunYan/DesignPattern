package com.test.pattern.construct.Proxy;


/**
 * 静态代理：代理类在编译的时候就实现好了，JAVA编译完成之后代理类是一个实际的class文件
 * */
public class Proxy implements Sourceable {
    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }
    @Override
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}  