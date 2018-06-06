package com.test.pattern.construct.Adapter;


/**
 * 接口适配器的测试
 * */
public class WrapperTest2 {
	public static void main(String[] args) {  
        Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  
          
        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  
    }  
}
