package com.test.pattern.create.factory;
import com.test.pattern.base.*;
/**
 * 多个工厂方法
 */
public class SendFactory1 {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
