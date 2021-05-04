package com.TestMaximum;

import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest {
	
	@Test
	public void maximumIntegerAtPosition1() {
		Integer maximumInteger = FindMaximum.maximumInteger(12, 4, 11);
		Assert.assertSame(12, maximumInteger);
	}
	
	@Test
	public void maximumIntegerAtPosition2() {
		Integer maximumInteger = FindMaximum.maximumInteger(4, 12, 11);
		Assert.assertSame(12, maximumInteger);
	}
	
	@Test
	public void maximumIntegerAtPosition3() {
		Integer maximumInteger = FindMaximum.maximumInteger(4, 11, 12);
		Assert.assertSame(12, maximumInteger);
	}
	
	@Test
	public void maximumFloatAtPosition1() {
		Float maximumFloat = FindMaximum.maximumFloat(4.2f, 3.1f, 1.5f);
		Assert.assertEquals((Float) 4.2f, maximumFloat);
	}
	
	@Test
	public void maximumFloatAtPosition2() {
		Float maximumFloat = FindMaximum.maximumFloat(3.1f, 4.2f, 1.5f);
		Assert.assertEquals((Float) 4.2f, maximumFloat);
	}

	@Test
	public void maximumFloatAtPosition3() {
		Float maximumFloat = FindMaximum.maximumFloat(1.5f, 3.1f, 4.2f);
		Assert.assertEquals((Float) 4.2f, maximumFloat);
	}
}