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
	
	@Test
	public void Test_Generics_OF_Integer_for_more_parameters() {
		Integer maxValueInteger = FindMaximum.maximumOfObject(98, 57, 48, 754, 63, 34, 25, 95, 43, 22, 514);
		Assert.assertEquals((Integer) 754, maxValueInteger);
	}

	@Test
	public void Test_Generics_OF_Float_for_more_parameters() {
		Float maxValueInteger = FindMaximum.maximumOfObject(159.95f, 234.998f, 456.9989f, 789.997f, 901.696f, 996.69f);
		Assert.assertEquals((Float) 996.69f, maxValueInteger);
	}
	
	@Test
	public void Test_Generics_OF_String_for_more_parameters() {
		String maxValueInteger = FindMaximum.maximumOfObject("DELL", "HP", "GOOGLE", "MICROSOFT", "LENOVO", "TESLA", "NASA", "TATA");
		Assert.assertEquals((String) "TESLA", maxValueInteger);
	}
}