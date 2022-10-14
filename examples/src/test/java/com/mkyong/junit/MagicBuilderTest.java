package com.mkyong.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagicBuilderTest {
	@Test
	public void testLucky() {
		assertEquals(7, MagicBuilder.getLucky());
	}
}
