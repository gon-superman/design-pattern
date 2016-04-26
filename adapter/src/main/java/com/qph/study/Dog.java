package com.qph.study;

public class Dog implements Animal {

	private Pet pet;
	
	public Dog(Pet pet){
		this.pet = pet;
	} 
	
	public void cute() {
		pet.cute();
	}

	public void catchMouse() {
		System.out.println("我要狗拿耗子多管闲事了。。。");
	}

}
