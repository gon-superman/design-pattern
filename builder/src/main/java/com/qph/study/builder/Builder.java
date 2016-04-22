package com.qph.study.builder;

import com.qph.study.product.Message;

public interface Builder {

	Message getMessage();
	
	void buildHead(String head);
	
	void buildBody(String body);
	
	void buildFoot(String foot);
}
