package com.TestMaximum;

public class FindMaximum 
{
	public static Integer maximumInteger(Integer a, Integer b, Integer c) {
		Integer maximumValue = a;
		if (b.compareTo(maximumValue) > 0)
			maximumValue = b;
		if (c.compareTo(maximumValue) > 0)
			maximumValue = c;
		return maximumValue;
	}
}