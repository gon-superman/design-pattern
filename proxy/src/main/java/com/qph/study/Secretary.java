package com.qph.study;

/**
 * 秘书
 * @author Administrator
 *
 */
public class Secretary implements Officer{

	private Officer officer;
	
	public Secretary(){
		this.officer = new Corrupt();
	}
	
	private void before(){
		System.out.println("想见我们老大，不意思下怎么行。嘿嘿~");
	}

	private void end(){
		System.out.println("事给你办了，为了下次好办事意思下吧。嘿嘿~");
	}

	public void doSoming() {
		before();
		officer.doSoming();
		end();
	}
}
