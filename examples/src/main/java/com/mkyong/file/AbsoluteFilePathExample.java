package com.mkyong.file;

import java.io.File;
import java.io.IOException;

/**
 * AbsoluteFilePathExample
 */
public class AbsoluteFilePathExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			File temp = File.createTempFile("i-am-a-temp-file", ".tmp");

			String absolutePath = temp.getAbsolutePath();
			System.out.println("File path : " + absolutePath);

			String filePath = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));

			System.out.println("File path : " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
