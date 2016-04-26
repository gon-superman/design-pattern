package com.qph.study;

public class MainTest {

	public static void main(String[] args) {
		Pet pet = new Pet();
		Animal cat = new Cat(pet);
		pet.cute();
		cat.cute();
	}

}
