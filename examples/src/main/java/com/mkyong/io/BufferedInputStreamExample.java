package com.mkyong.io;

import java.io.*;

/**
 * BufferedInputStreamExample
 */
public class BufferedInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("resources/testing.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream(file);

			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			while (dis.available() != 0) {
				System.out.println(dis.readLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
