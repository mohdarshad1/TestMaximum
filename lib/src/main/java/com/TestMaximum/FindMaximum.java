package com.TestMaximum;

public class FindMaximum 
{	
	// Generic Method
	public static <T extends Comparable<T>> T maximumOfObject(T first, T second, T third) {
		T maximumValue = first; 
		if (second.compareTo(maximumValue) > 0)
			maximumValue = second;
		if (third.compareTo(maximumValue) > 0)
			maximumValue = third; 
		
		System.out.println(maximumValue);
		return maximumValue;
	}
}