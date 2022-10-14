package com.mkyong.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serializer
 */
public class Serializer {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Serializer serializer = new Serializer();
		serializer.serializeAddress("wall street", "united state");
	}

	public void serializeAddress(String street, String country) {

		Address address = new Address();
		address.setStreet(street);
		address.setCountry(country);

		try {
			FileOutputStream fout = new FileOutputStream("resources/address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
