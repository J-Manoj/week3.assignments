package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				// Sort the array	
				
				// loop through the array (start i from arr[0] till the length of the array)

				// check if the iterator variable is not equal to the array values respectively
				
				// print the number
				
				// once printed break the iteration
				
				List<Integer> data = new ArrayList<Integer>();
				for(int eachValue: arr) {
					data.add(eachValue);
				}
				Collections.sort(data);
				int count = 1;
				for(int eachData: data)
				{
					if(eachData==count) {
						count++;
					}
					else
						{System.out.println("Missing Number is :"+count++);
						break;}
				}
	}

}
