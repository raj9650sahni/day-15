package com.genericMethod;

public class GenericMax<T extends Comparable<T>> {
	
	T first,sec,third;
	
	// find the maximum 
	public GenericMax(T first, T sec, T third) {
		this.first = first;
		this.sec = sec;
		this.third = third;
	} 
	

	public T findMaximumValue() {
		printMax(first, sec, third, maxOfMany(first, sec, third));
		return GenericMax.maxOfMany(first, sec, third);
	}
	
	// generic method
	public static <T extends Comparable<T>> T maxOfMany(T first, T sec, T third,T... value) {
		T max = first; 
		if (sec.compareTo(max) > 0)
			max = sec; 
		if (third.compareTo(max) > 0)
			max = third; 
		if (value.length != 0) {
			max = maxOfTwo(max, value);
		}
		return max;
	}

	
	//  method for more values
	public static <T extends Comparable<T>> T maxOfTwo(T maximum, T ...values) {
		for (T value : values) {
			
			if (value.compareTo(maximum) > 0)
				maximum = value;
		}
		System.out.println("maximum is :" + maximum );
		return maximum;
	}
	// printing maximum values
	public static <T> void printMax(T first, T sec, T third, T max) {
		System.out.println("max of in thsese values  " + first + "," + sec + "," + third + " is " + max);
	}


}
