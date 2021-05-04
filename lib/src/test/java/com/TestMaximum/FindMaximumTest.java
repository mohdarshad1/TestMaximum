package com.TestMaximum;

import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest {
	
	@Test
	public void Test_Generics_OF_Integer() {
		Integer maxValue = new FindMaximum<Integer>(999, 88, 7).findMaximumValue();
		Assert.assertEquals((Integer) 999, maxValue);
	}
	
	@Test
	public void Test_Generics_OF_Float() {
		Float maxValue = new FindMaximum<Float>(88.3f, 56.2f, 7.2f).findMaximumValue();
		Assert.assertEquals((Float) 88.3f, maxValue);
	}
	
	@Test
	public void Test_Generics_OF_String() {
		String maxValue = new FindMaximum<String>("peach", "apple", "banana").findMaximumValue();
		Assert.assertEquals((String)"peach", maxValue);
	}
}