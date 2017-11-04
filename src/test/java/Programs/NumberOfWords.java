package Programs;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		
	System.out.println("Enter a string");
	Scanner sf = new Scanner(System.in);
	String given = sf.nextLine();
	
	System.out.println(given.length());
		String[] updated =given.split(" ");
		
		System.out.printf("number of words '%s'",updated.length);
		for(int i=0;i<=updated.length-1;i++)
		{
	   
		System.out.println(updated[i]);
		//System.out.println(updated[1]);
		//System.out.println(updated[2]);
		//System.out.println(updated[3]);
		
		}

	}

}
