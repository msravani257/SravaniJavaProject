package Programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sf = new Scanner(System.in);
		
		String value = sf.nextLine();
		String new_String = "";
		for(int i=value.length()-1;i>=0;i--)
		{
			new_String += value.charAt(i);
			
			
		}
		
		System.out.println(new_String);
		System.out.println(value);
		
		if(new_String.equals(value))
		{
			System.out.print("Its a Palindrome");
			
		}
		else
		{
			System.out.print("Not a Palindrome");
		}	
		
		
	}

}
