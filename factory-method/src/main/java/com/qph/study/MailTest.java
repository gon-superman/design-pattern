package com.qph.study;

import com.qph.study.factory.SendFactory1;
import com.qph.study.factory.SendFactory2;
import com.qph.study.factory.SendFactory3;
import com.qph.study.service.Sender;

public class MailTest {

	public static void main(String[] args) {
		SendFactory1 factory1 = new SendFactory1();
		try {
			Sender sender = factory1.getSender("mail");
			sender.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		SendFactory2 factory2 = new SendFactory2();
		Sender sender2 = factory2.getSmsSender();
		sender2.send();
		
		Sender sender3 = SendFactory3.getMailSender();
		sender3.send();
	}
}
