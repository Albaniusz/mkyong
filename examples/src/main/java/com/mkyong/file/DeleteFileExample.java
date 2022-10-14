package com.mkyong.file;

import java.io.File;

/**
 * DeleteFileExample
 */
public class DeleteFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			File file = new File("resources/logfile20100131.log");

			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
