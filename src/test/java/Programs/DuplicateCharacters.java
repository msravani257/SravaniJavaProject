package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sf = new Scanner(System.in);
		String value = sf.nextLine();
		char[] characters = value.toCharArray();
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character i :characters)
		{
			if(charMap.containsKey(i))
			{
			  charMap.put(i, charMap.get(i)+1);
			}
			else
			{
				charMap.put(i, 1);
			}
			
		}
		
		for(int i =0;i<=value.length()-1;i++)
		{
			char word = value.charAt(i);
			if(charMap.get(word)>1)
			{
			System.out.println(word);
				
				
			}
			}
	//	   throw new RuntimeException("Undefined behaviour");

	
		

	}

}
