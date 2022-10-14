package com.mkyong.json.jackson;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MapToJSONFile
 */
public class MapToJSONFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "mkyong");
		map.put("age", 29);

		List<Object> list = new ArrayList<Object>();
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");

		map.put("messages", list);

		try {
			// write JSON to a file
			mapper.writeValue(new File("resources/json/map.json"), map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
