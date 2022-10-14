package com.mkyong.file;

/**
 * RenameFileExample
 */

import java.io.File;

public class RenameFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File oldfile = new File("resources/oldfile.txt");
		File newfile = new File("resources/newfile.txt");

		if (oldfile.renameTo(newfile)) {
			System.out.println("Rename succesful");
		} else {
			System.out.println("Rename failed");
		}
	}
}
