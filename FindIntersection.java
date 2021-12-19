package week3.assignments;


import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		Set<Integer> one = new LinkedHashSet<Integer>();
		for(int eachData: arr1)
		{	
			one.add(eachData);
		}
		for(int eachValue: arr2)
		{
			boolean cs = one.add(eachValue);
			if(cs==false)
			{
				System.out.println("First Matching Array is: "+eachValue);
				break;
			}
			
		}
		
		
	}

}
