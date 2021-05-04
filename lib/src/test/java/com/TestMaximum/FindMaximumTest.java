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
}
