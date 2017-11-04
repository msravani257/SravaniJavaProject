package Programs;

import java.util.HashMap;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char va = first();
		System.out.println(va);
		System.out.printf("first non repated in String '%s' %n", va);
	}
	
	public static char first()
	{
		
		String s = "sravani";
		char[] cha = s.toCharArray();
		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		for(Character c : cha)
		{
			if(hash.containsKey(c))
			{
				hash.put(c, hash.get(c)+1);
			}
			
			else
			{
				hash.put(c, 1);
			}
			
		}
		
		for(int i =0;i<=s.length();i++)
		{
			char word = s.charAt(i);
			if(hash.get(word)==1)
			{
			return word;
				
				
			}
			}
		   throw new RuntimeException("Undefined behaviour");
			
		}
		
		
	
		
		
	}


