package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dupli {

	public static void main(String[] args) {
	
		String s = "Sravani is a good girl";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character i : ch)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			
			else
			{
				map.put(i, 1);
			}
				
		}
		
		Set<Map.Entry<Character, Integer>> entry = map.entrySet();
	
		System.out.printf("The number of duplicate character in %s \n", s);
		for(Map.Entry<Character, Integer> en : entry)
		
		
		{
			if(en.getValue()>1)
			{
				System.out.printf("%s : %d \n",en.getKey(),en.getValue());
			
	
			}
		}
	}

}
