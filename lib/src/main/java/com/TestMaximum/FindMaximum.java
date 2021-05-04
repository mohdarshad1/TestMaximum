package com.TestMaximum;

public class FindMaximum<T extends Comparable<T>> {
	T firstValue;
	T secondValue;
	T thirdValue;

	public FindMaximum(T firstValue, T secondValue, T thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	} 
	
	public T findMaximumValue() {
		return FindMaximum.maximumOfObject(firstValue, secondValue, thirdValue);
	}
	
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