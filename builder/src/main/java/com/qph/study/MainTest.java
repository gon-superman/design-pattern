package com.qph.study;

import com.qph.study.builder.Builder;
import com.qph.study.builder.MailBuilder;
import com.qph.study.builder.TextBuilder;

public class MainTest {

	public static void main(String[] args) {
		Builder builder = new TextBuilder();
		Director director = new Director(builder);
		director.construct("text head","text body","text foot");
		builder.getMessage();
		
		Builder builder1 = new MailBuilder();
		Director director1 = new Director(builder1);
		director1.construct("mail head","mail body","mail foot");
		builder1.getMessage();
		
		
	}
}
