package com.TestMaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
	
	// maximum method for more variables
	public static <T extends Comparable<T>> T maximumOfObject(T... value) {
		List<T> list = Arrays.asList(value);
		Collections.sort(list);
		System.out.println("Maximum Value is " + list.get(list.size() - 1));
		return list.get(list.size() - 1);
	}
}