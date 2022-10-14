package com.mkyong.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReaderExample1
 */
public class BufferedReaderExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("resources/testing.txt"))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
