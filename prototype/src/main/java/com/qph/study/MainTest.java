package com.qph.study;

public class MainTest {

	public static void main(String[] args) {
		Prototype p = new Prototype();
		
		try{
			Prototype p1 = p.clone();
			Prototype p2 = p.deepClone();
			System.out.println(p == p1);
			System.out.println(p == p2);
			
			System.out.println(p.getName() == p1.getName());
			System.out.println(p.getName() == p2.getName());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
