package com.mkyong.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Deserializer
 */
public class Deserializer {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		Deserializer deserializer = new Deserializer();
		Address address = deserializer.deserialzeAddress();
		System.out.println(address);
	}

	public Address deserialzeAddress() {

		Address address;

		try {
			FileInputStream fin = new FileInputStream("resources/address.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			address = (Address) ois.readObject();
			ois.close();

			return address;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
