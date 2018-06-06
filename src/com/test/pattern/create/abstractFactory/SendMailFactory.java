package com.test.pattern.create.abstractFactory;

import com.test.pattern.base.*;
public class SendMailFactory implements Provider {  
    
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}  
