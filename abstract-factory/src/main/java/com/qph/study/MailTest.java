package com.qph.study;

import com.qph.study.factory.Provider;
import com.qph.study.factory.impl.MailProvider;
import com.qph.study.factory.impl.SmsProvider;
import com.qph.study.service.Sender;

public class MailTest {

	public static void main(String[] args) {
		Provider provider1 = new MailProvider();
		Sender sender1 = provider1.getSender();
		sender1.send();
		
		Provider provider2 = new SmsProvider();
		Sender sender2 = provider2.getSender();
		sender2.send();
	}
}
