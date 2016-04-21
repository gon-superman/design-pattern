package com.qph.study;

public class Singleton {

	
	private Singleton(){
	}
	
	private static class SingletonFactory{
		
		private static Singleton singleton = new Singleton();
	}
	
	
	public static Singleton getInstance(){
		return SingletonFactory.singleton;
	}
}
