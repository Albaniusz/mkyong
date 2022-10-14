package com.mkyong.file;

import java.io.File;
import java.io.IOException;

/**
 * FileHidden
 */
public class FileHidden {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("resources/hidden-file.txt");

		if (file.isHidden()) {
			System.out.println("This file is hidden");
		} else {
			System.out.println("This file is not hidden");
		}
	}
}
