package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
				List<Integer> arr = new ArrayList<Integer>();
				for (int eachValue: data)
				{
					arr.add(eachValue);
				}
				Collections.sort(arr);
				int siz = arr.size()-2;
				System.out.println(arr.get(siz));
	}

}
