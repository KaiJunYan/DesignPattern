package com.test.pattern.construct.Bridge;

public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
