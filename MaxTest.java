package com.testmax;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import com.genericMethod.GenericMax;

import junit.framework.Assert;

public class MaxTest {
	
	@Test
	public void generic_Test_Integer() {
		Integer maxValue = new GenericMax <Integer>(55, 44, 22).findMaximumValue();
		Assert.assertEquals((Integer) 55, maxValue);
	}
	
	@Test
	public void generic_Test_Float() {
		Float maxValue = new GenericMax<Float>(88.3f, 56.2f, 31.1f).findMaximumValue();
		Assert.assertEquals((Float) 88.3f, maxValue);
	}
	
	@Test
	public void generic_Test_String() {
		String maxValue = new GenericMax<String>("peach", "apple", "banana").findMaximumValue();
		Assert.assertEquals((String)"peach", maxValue);
	}
	
	@Test
	public void generic_Test_More_Para_Integer() {
		Integer maxValueInteger = GenericMax.maxOfMany(213, 565, 21, 6758, 13, 22, 111, 243, 98, 878, 213);
		Assert.assertEquals((Integer) 6758, maxValueInteger);
	}

	@Test
	public void generic_Test_Integer_More_Para() {
		Float maxValueInteger = GenericMax.maxOfMany(259.45f, 134.498f, 556.989f, 698.898f, 901.586f, 983.96f);
		Assert.assertEquals((Float) 983.96f, maxValueInteger);
	}
	
	@Test
	public void generic_Test_String_More_Para() {
		String maxValueInteger = GenericMax.maxOfMany("walmart", "facebook", "nokia", "Huawei", "samsung", "tcs", "flipkart", "xiaomi");
		Assert.assertEquals((String) "xiaomi", maxValueInteger);
	}

}
