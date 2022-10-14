package com.mkyong.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		Exception1Test.class, //test case 1
		TimeoutTest.class     //test case 2
})
public class SuiteAbcTest {
	//normally, this is an empty class
}