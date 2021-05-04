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

	public static Float maximumFloat(  Float d, Float e, Float f) {
		Float maximumValue = d;
		if (e.compareTo(maximumValue) > 0)
			maximumValue = e;
		if (f.compareTo(maximumValue) > 0)
			maximumValue = f;
		System.out.println(maximumValue);
		return maximumValue;
	}
	
	public static String maximumString(  String g, String h,String i) {
		String maximumValue = g;
		if (h.compareTo(maximumValue) > 0)
			maximumValue = h;
		if (i.compareTo(maximumValue) > 0)
			maximumValue = i;
		System.out.println(maximumValue);
		return maximumValue;
	}
}