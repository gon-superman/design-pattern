package com.qph.study.factory;

import com.qph.study.service.Sender;
import com.qph.study.service.impl.MailSender;
import com.qph.study.service.impl.SmsSender;

public class SendFactory3 {

	public static Sender getMailSender(){
		
		return new MailSender();
	}
	
	public static Sender getSmsSender(){
		
		return new SmsSender();
	}
}
