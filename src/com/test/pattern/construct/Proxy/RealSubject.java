package com.test.pattern.construct.Proxy;

public class RealSubject implements Subject{

    public void request(){
        System.out.println("执行目标里面的request方法。。。。");
    }
}
