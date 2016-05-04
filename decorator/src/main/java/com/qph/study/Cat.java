package com.qph.study;

public class Cat implements Animal{

	private Animal animal;
	
	public Cat(Animal animal){
		this.animal = animal;
	}
	
	public void cute() {
		animal.cute();
		say();
	}

	private void say(){
		System.out.println("我是一只小猫咪，喵喵喵~~");
	}
}
