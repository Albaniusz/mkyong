package com.mkyong.test;

import com.mkyong.test.core.Test;
import com.mkyong.test.core.TesterInfo;
import com.mkyong.test.core.TesterInfo.Priority;

/**
 * TestExample
 */
@TesterInfo(
		priority = Priority.HIGH,
		createdBy = "mkyong.com",
		tags = {"sales", "test"}
)

public class TestExample {

	@Test
	void testA() {
		if (true)
			throw new RuntimeException("This test always failed");
	}

	@Test(enabled = false)
	void testB() {
		if (false)
			throw new RuntimeException("This test always passed");
	}

	@Test(enabled = true)
	void testC() {
		if (10 > 1) {
			// do nothing, this test always passed.
		}
	}
}
