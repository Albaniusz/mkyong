package com.mkyong.example;

import java.util.ArrayList;
import java.util.List;

/**
 * JoinListsExample
 */
public class JoinListsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listA = new ArrayList<String>();
		listA.add("A");

		List<String> listB = new ArrayList<String>();
		listB.add("B");

		List<String> listFinal = new ArrayList<String>();
		listFinal.addAll(listA);
		listFinal.addAll(listB);

		//same result
		//List<String> listFinal = new ArrayList<String>(listA);
		//listFinal.addAll(listB);

		System.out.println("listA : " + listA);
		System.out.println("listB : " + listB);
		System.out.println("listFinal : " + listFinal);
	}
}
