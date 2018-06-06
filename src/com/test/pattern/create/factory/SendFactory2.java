package com.test.pattern.create.factory;
import com.test.pattern.base.*;
/**
 * 静态工厂方法
 */
public class SendFactory2 {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
