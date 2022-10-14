package com.mkyong.file;

import java.io.File;

/**
 * FileExistsChecker
 */
public class FileExistsChecker {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		File f = new File("resources/mkyong.txt");

		if (f.exists()) {
			System.out.println("File existed");
		} else {
			System.out.println("File not found!");
		}
	}
}
