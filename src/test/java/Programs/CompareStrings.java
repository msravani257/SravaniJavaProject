package Programs;

public class CompareStrings {

	public static void main(String[] args) {
		
		
		
		
		
		String s = "HiHi hellow";
		String s1= "hello";
		  String str = "this is Java";
		  str.toUpperCase();
		String[] ch = str.split(" ");
		long time = System.currentTimeMillis();
		System.out.println(time);
		for(int i=0;i<=ch.length-1;i++)
		{
		System.out.println(ch[i]);
		}
		long end = System.currentTimeMillis();
		System.out.println(time-end);
	      System.out.println(removeCharAt(str, 9));
	}
	
	
	public static String removeCharAt(String s, int pos) {
	      return  s.substring(0,pos) +s.substring(pos + 1);
	   }

}
