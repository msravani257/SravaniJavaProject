package Programs;

import org.apache.poi.util.SystemOutLogger;

public class ReverseEachWord {

	public static void main(String[] args) {
	String given = "Sravani is a good girl";
	String[] givens = given.split(" ");
    String rev = "";
	for(int i=0;i<=givens.length-1;i++)
	{
		String word = givens[i];
		String revWord = "";
		for(int j=word.length()-1;j>=0;j--)
		{
			revWord = revWord+word.charAt(j);
			
		}
		
		rev = rev+ revWord+" ";
	
	}
	System.out.println(rev);

	}

}
