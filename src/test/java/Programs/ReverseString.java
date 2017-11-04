package Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sf = new Scanner(System.in);
		String name = sf.nextLine();
		String reverse_name = new String("");
		
			
	for(int i=name.length()-1;i>=0;i--)
	{
		reverse_name += name.charAt(i);
	 
	}	 
	System.out.print(reverse_name);
	}

}
