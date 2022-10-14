package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * PrettyPrintJSON
 */
public class PrettyPrintJSON {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DataObject obj = new DataObject();
		// Gson gson = new Gson();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(obj);

		System.out.println(json);
	}
}
