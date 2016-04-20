package com.qph.study.factory;

import com.qph.study.service.Sender;
import com.qph.study.service.impl.MailSender;
import com.qph.study.service.impl.SmsSender;

public class SendFactory2 {

	public Sender getMailSender(){
		
		return new MailSender();
	}
	
	public Sender getSmsSender(){
		
		return new SmsSender();
	}
}
