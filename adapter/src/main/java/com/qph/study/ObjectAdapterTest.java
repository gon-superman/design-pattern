package com.qph.study;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		Pet pet = new Pet();
		Animal animal = new Dog(pet);
		animal.cute();
		animal.catchMouse();
	}

}
