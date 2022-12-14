package com.mkyong.junit4;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class ListTest {
	@Test
	public void testAssertList() {
		List<String> actual = Arrays.asList("a", "b", "c");
		List<String> expected = Arrays.asList("a", "b", "c");

		//All passed / true

		//1. Test equal.
		assertThat(actual, is(expected));

		//2. If List has this value?
		assertThat(actual, hasItems("b"));

		//3. Check List Size
		assertThat(actual, hasSize(3));

		assertThat(actual.size(), is(3));

		//4.  List order

		// Ensure Correct order
		assertThat(actual, contains("a", "b", "c"));

		// Can be any order
		assertThat(actual, containsInAnyOrder("c", "b", "a"));

		//5. check empty list
		assertThat(actual, not(IsEmptyCollection.empty()));

		assertThat(new ArrayList<>(), IsEmptyCollection.empty());
	}
}
