package com.qph.study.factory;

import com.qph.study.service.Sender;
import com.qph.study.service.impl.MailSender;
import com.qph.study.service.impl.SmsSender;

public class SendFactory1 {

	public Sender getSender(String type) throws Exception{
		if (type.equals("mail")){
			return new MailSender();
		} else if (type.equals("sms")){
			return new SmsSender();
		} else {
			throw new Exception("无法匹配该类型！");
		}
	}
}
