package com.mkyong.file;

import java.io.*;

/**
 * ReadUTF8EncodedDataFromFile
 */
public class ReadUTF8EncodedDataFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			File fileDir = new File("resources/test.txt");

			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));

			String str;

			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
