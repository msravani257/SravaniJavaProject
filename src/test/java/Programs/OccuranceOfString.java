package Programs;

import java.util.Scanner;

public class OccuranceOfString {

	public static void main(String[] args) {

	/*String s = "Sravani is SDET in snap chat";
	char[] c = s.toUpperCase().toCharArray();
	System.out.println("Enter a character");
	Scanner sf = new Scanner(System.in);
	String f = sf.nextLine();
    int count =0;
	
	for(int i =0;i<=c.length-1;i++)
	{
		if(s.contains(f.toUpperCase()))
		{
		count++;		
			
		}		
			
	}
	
	//System.out.print(count);

	}*/
		
		String s = "Sravani is SDET in snap chat";
		 
		System.out.println("Enter a character");
		Scanner sf = new Scanner(System.in);
		String f = sf.nextLine();       
 
        int count = s.length() - s.replace(f, "").length();
 
        System.out.println("Number of occurances of "+f+" in "+s+" = "+count);
    }

}
