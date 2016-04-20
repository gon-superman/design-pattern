package com.qph.study.factory.impl;

import com.qph.study.factory.Provider;
import com.qph.study.service.Sender;
import com.qph.study.service.impl.MailSender;

public class MailProvider implements Provider {

	public Sender getSender() {
		return new MailSender();
	}

}
