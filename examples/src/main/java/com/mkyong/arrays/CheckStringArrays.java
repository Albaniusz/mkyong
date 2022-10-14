package com.mkyong.arrays;

import java.util.Arrays;
import java.util.List;

public class CheckStringArrays {
	public static void main(String[] args) {
		String[] alphabet = new String[]{"A", "B", "C"};

		// Convert String Array to List
		List<String> list = Arrays.asList(alphabet);

		if (list.contains("A")) {
			System.out.println("Hello A");
		}
	}
}
