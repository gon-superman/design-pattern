package com.qph.study;

public class Cat implements Animal{

	private Pet pet;
	
	public Cat(Pet pet){
		this.pet = pet;
	}
	
	public void cute() {
		pet.cute();
		say();
	}

	private void say(){
		System.out.println("我是一只小猫咪，喵喵喵~~");
	}
}
