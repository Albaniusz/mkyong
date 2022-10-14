package com.mkyong.file;

import java.io.*;

/**
 * WriteUTF8EncodedDataIntoFile
 */
public class WriteUTF8EncodedDataIntoFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			File fileDir = new File("resources/test.txt");

			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF8"));

			out.append("Website UTF-8").append("\r\n");
			out.append("?? UTF-8").append("\r\n");
			out.append("??????? UTF-8").append("\r\n");

			out.flush();
			out.close();
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
