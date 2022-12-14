package com.mkyong.junit4;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Exception2Test {
	@Test
	public void testDivisionWithException() {
		try {
			int i = 1 / 0;
			fail(); //remember this line, else 'may' false positive
		} catch (ArithmeticException e) {
			assertThat(e.getMessage(), is("/ by zero"));
			//assert others
		}
	}

	@Test
	@Ignore
	public void testEmptyList() {
		try {
			new ArrayList<>().get(0);
			fail();
		} catch (IndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
	}
}
