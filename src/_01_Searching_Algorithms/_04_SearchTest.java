package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] s = {"Apple","Banana","Carrot"};
		assertEquals(2,_00_LinearSearch.linearSearch(s,"Carrot"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] i = {1,3,6,9,14,16,243,8876};
		assertEquals(4,_01_BinarySearch.binarySearch(i,0,i.length,14));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] i = {2,4,6,8,10,12,14,16,18,20,22,24};
		assertEquals(6,_02_InterpolationSearch.interpolationSearch(i,14));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] i = {1,3,6,9,14,16,243,8876};
		assertEquals(4,_03_ExponentialSearch.exponentialSearch(i, 14));
	}
}
