package com.test.pattern.construct.Proxy;

/**
 * 测试jdk的动态代理
 * */
public class JdkProxyClient {
    public static void main(String[] args){
        Subject proxy = SubjectHandler.createProxy();
        proxy.request();
    }
}
