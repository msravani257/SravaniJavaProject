package Programs;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "Sravani is a good girl";
		char[] ch = s.toCharArray();
		StringBuffer br = new StringBuffer();
		
		for(int i =0;i<=ch.length-1;i++)
		{
			if((ch[i]!=' ') && (ch[i]!='\t'))
			{
				br.append(ch[i]);
			}
		}
		System.out.println(br);
	}

}
