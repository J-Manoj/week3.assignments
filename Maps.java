package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PayPal India";
		char[] arr = str.toCharArray();
		//Map<Integer, Character> data = new HashMap<Integer, Character>();
		Map<Character, Integer> data = new HashMap<Character, Integer>();
		for(char ch : arr)
		{
			if(data.containsKey(ch)) {
				data.put(ch, data.get(ch)+1);
				//data.put(ch, data.get(ch)+1);
				
			}
			else
				data.put(ch, 1); 
		}
		List<Integer> dat = new ArrayList<Integer>(data.values());
		Collections.sort(dat);
		int siz = dat.size()-2;
		
		Set<Entry<Character, Integer>> entrySet = data.entrySet();
		for(Entry<Character, Integer>ch: entrySet)
		{
			
		if(dat.get(siz)==ch.getValue())
		{
			System.out.println("Second Highest Occurance: "+ch.getKey()+"-"+ch.getValue());
		}
		}
		
		 
		
		  
		 
		
	}

}
