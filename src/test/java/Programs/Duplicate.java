package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {
	
	public static void FindDuplicates(String word)
	{
		char[] chara = word.toCharArray();
		HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
		for(Character i : chara)
		{
			
	if(hashMap.containsKey(i))
	{
		hashMap.put(i, hashMap.get(i));
	}
	
	else
	{
		hashMap.put(i,1);
	}
		}
		
		
		
		System.out.println(hashMap);
		 
		
		
	}
	
	public static void main(String[] args) {
		
FindDuplicates("Sravani");
		
	}

}
