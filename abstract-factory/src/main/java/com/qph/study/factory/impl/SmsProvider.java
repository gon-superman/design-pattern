package com.qph.study.factory.impl;

import com.qph.study.factory.Provider;
import com.qph.study.service.Sender;
import com.qph.study.service.impl.SmsSender;

public class SmsProvider implements Provider {

	public Sender getSender() {
		return new SmsSender();
	}

}
