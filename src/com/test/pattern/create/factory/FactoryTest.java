package com.test.pattern.create.factory;
import com.test.pattern.base.*;


/**
 * 普通工厂模式
 * */
public class FactoryTest {  
	  
    public static void main(String[] args) { 
    	
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
        
        SendFactory1 factory1 = new SendFactory1();  
        Sender sender1 = factory1.produceMail();  
        sender1.Send();
        
        
        Sender sender2 = SendFactory2.produceMail();  
        sender2.Send();  
        
    }  
}  