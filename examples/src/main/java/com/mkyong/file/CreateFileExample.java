package com.mkyong.file;

import java.io.File;
import java.io.IOException;

/**
 * CreateFileExample
 */
public class CreateFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			File file = new File("resources/newfile.txt");

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
