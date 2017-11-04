package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
	boolean va = isAnagram();
	System.out.println(va);
	
	
	}

public static boolean isAnagram()
{
	String firstWord = "Army";
	String secondWord = "Mary";
	char[] charFromfirstWord = firstWord.toUpperCase().toCharArray();
	char[] charFromsecondWord = secondWord.toUpperCase().toCharArray();
	Arrays.sort(charFromfirstWord);
	Arrays.sort(charFromsecondWord);

return Arrays.equals(charFromfirstWord, charFromsecondWord);
}

}
