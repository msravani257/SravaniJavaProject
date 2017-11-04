package Programs;

import java.util.HashMap;

public class NumOfOccurancesOfEachCharacter {

	public static void main(String[] args) {
		
		String given = "My name is Sravani";
		char[] c = given.toUpperCase().toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character i :c)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
				
			}
			
			else
			{
				hm.put(i, 1);
			}
		}
		
		System.out.println(hm);

	}

}
