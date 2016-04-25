package com.qph.study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = -5732836655466564429L;
	
	private String name = "demo";
	
	
	public String getName() {
		return name;
	}


	/**
	 * 浅克隆
	 */
	public Prototype clone() throws CloneNotSupportedException{
		return (Prototype) super.clone();
	}
	
	
	/**
	 * 深克隆
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Prototype deepClone() throws IOException, ClassNotFoundException{
		//将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Prototype) ois.readObject();
	}
}
