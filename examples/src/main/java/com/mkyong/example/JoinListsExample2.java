package com.mkyong.example;

import org.apache.commons.collections.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * JoinListsExample2
 */
public class JoinListsExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listA = new ArrayList<String>();
		listA.add("A");

		List<String> listB = new ArrayList<String>();
		listB.add("B");

		List<String> listFinal = ListUtils.union(listA, listB);

		System.out.println("listA : " + listA);
		System.out.println("listB : " + listB);
		System.out.println("listFinal : " + listFinal);
	}
}
