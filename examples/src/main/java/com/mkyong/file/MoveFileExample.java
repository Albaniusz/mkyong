package com.mkyong.file;

import java.io.File;

/**
 * MoveFileExample
 */
public class MoveFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			File afile = new File("resources/folderA/fileA.txt");

			if (afile.renameTo(new File("resources/folderB/" + afile.getName()))) {
				System.out.println("File is moved successful!");
			} else {
				System.out.println("File is failed to move!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
