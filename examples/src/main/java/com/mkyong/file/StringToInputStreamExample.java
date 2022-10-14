package com.mkyong.file;

import java.io.*;

/**
 * StringToInputStreamExample
 */
public class StringToInputStreamExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String str = "This is a String ~ GoGoGo";

		// convert String into InputStream
		InputStream is = new ByteArrayInputStream(str.getBytes());

		// read it with BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}
}
