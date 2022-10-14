package com.mkyong.file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * GetFileLastModifiedExample
 */
public class GetFileLastModifiedExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("resources/logfile.log");

		System.out.println("Before Format : " + file.lastModified());

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		System.out.println("After Format : " + sdf.format(file.lastModified()));
	}
}
