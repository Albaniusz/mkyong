package com.mkyong.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageBuilderTest {
	@Test
	public void testHelloWorld() {
		assertEquals("hello world", MessageBuilder.getHelloWorld());
	}

	@Test
	public void testNumber10() {
		assertEquals(10, MessageBuilder.getNumber10());
	}
}
