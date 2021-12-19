package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0

		Set<Integer> data = new LinkedHashSet<Integer>();
		System.out.println("Duplicates are: ");
		for(int eachValue: arr) {
			boolean cs = data.add(eachValue);
			if(cs == false)
			{
				System.out.print(eachValue+" ");
			}
		}
		
	}

}
