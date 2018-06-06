package com.test.pattern.create.abstractFactory;

import com.test.pattern.base.*;

public class SendSmsFactory implements Provider{  
	  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  