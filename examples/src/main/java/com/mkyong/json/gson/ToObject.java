package com.mkyong.json.gson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ToObject
 */
public class ToObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gson gson = new Gson();

		try {
			BufferedReader br = new BufferedReader(new FileReader("resources/json/file.json"));

			//convert the json string back to object
			DataObject obj = gson.fromJson(br, DataObject.class);

			System.out.println(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
